package br.com.poli.eventflow.core;

import br.com.poli.eventflow.EventFlowBaseVisitor;
import br.com.poli.eventflow.EventFlowParser;

import java.util.regex.Pattern;

public class SemanticAnalyzerVisitor extends EventFlowBaseVisitor<Void> {
    private final SymbolTable symbolTable;
    private boolean hasErrors = false;

    // Padrões para validação de tipos customizados
    private static final Pattern HEX_COLOR_PATTERN = Pattern.compile("^#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$");
    private static final Pattern SEMVER_PATTERN = Pattern.compile("^\\d+\\.\\d+\\.\\d+$");

    public SemanticAnalyzerVisitor(SymbolTable table) {
        this.symbolTable = table;
    }

    public boolean hasErrors() {
        return hasErrors;
    }

    @Override
    public Void visitConfig_def(EventFlowParser.Config_defContext ctx) {
        System.out.println(" -> Analisando bloco 'config'...");
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitProp_stmt(EventFlowParser.Prop_stmtContext ctx) {
        String varName = ctx.ID().getText();
        String type = "string"; // Tipo padrão
        Object value = ctx.value().getText().replace("\"", "");

        EventFlowParser.ValueContext valCtx = ctx.value();
        if (valCtx.func_call() != null) {
            String funcName = valCtx.func_call().ID().getText();
            String arg = valCtx.func_call().value().getText().replace("\"", "");
            type = funcName;
            value = arg;

            switch (type) {
                case "color":
                    if (!HEX_COLOR_PATTERN.matcher(arg).matches()) {
                        logError(ctx.start.getLine(), "Valor '" + arg + "' para a variável '" + varName + "' não é uma cor hexadecimal válida (ex: #RRGGBB).");
                    }
                    break;
                case "semver":
                    if (!SEMVER_PATTERN.matcher(arg).matches()) {
                        logError(ctx.start.getLine(), "Valor '" + arg + "' para a variável '" + varName + "' não é uma versão semântica válida (ex: 1.0.0).");
                    }
                    break;
                default:
                    logError(ctx.start.getLine(), "Função de tipo desconhecida '" + funcName + "'.");
                    break;
            }
        }

        System.out.println("    - Declarando variável: " + varName + " (tipo: " + type + ")");
        symbolTable.define(new Symbol(varName, type, value));
        return null;
    }

    @Override
    public Void visitValue(EventFlowParser.ValueContext ctx) {
        if (ctx.ID() != null && ctx.getChildCount() > 1 && ctx.getChild(1).getText().equals(".")) {
            String scope = ctx.ID(0).getText();
            String varName = ctx.ID(1).getText();

            if (!scope.equals("config")) {
                logError(ctx.start.getLine(), "Escopo desconhecido '" + scope + "'. Use 'config' para acessar variáveis.");
            } else if (symbolTable.resolve(varName) == null) {
                logError(ctx.start.getLine(), "Variável '" + varName + "' não foi declarada no bloco 'config'.");
            }
        }
        return visitChildren(ctx);
    }

    private void logError(int line, String message) {
        System.err.printf("Erro Semântico (linha %d): %s\n", line, message);
        hasErrors = true;
    }
}
