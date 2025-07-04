package br.com.poli.eventflow.codegen;

import br.com.poli.eventflow.EventFlowBaseVisitor;
import br.com.poli.eventflow.EventFlowParser;
import br.com.poli.eventflow.core.Symbol;
import br.com.poli.eventflow.core.SymbolTable;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class BuildVisitor extends EventFlowBaseVisitor<Object> {
    private final SymbolTable symbolTable;

    public BuildVisitor(SymbolTable table) {
        this.symbolTable = table;
    }

    private String substitutePlaceholders(String content) {
        String resultContent = content;
        for (Map.Entry<String, Symbol> entry : symbolTable.getSymbols().entrySet()) {
            String placeholder = "{{" + entry.getKey() + "}}";
            if (resultContent.contains(placeholder)) {
                System.out.println("    -> Substituindo '" + placeholder + "' por '" + entry.getValue().value.toString() + "'");
            }
            resultContent = resultContent.replace(placeholder, entry.getValue().value.toString());
        }
        return resultContent;
    }

    @Override
    public Object visitPlatform_def(EventFlowParser.Platform_defContext ctx) {
        String platform = ctx.STRING().getText().replace("\"", "");
        System.out.println("\n[Compilador] A gerar ficheiros para a plataforma: " + platform);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPlatform_stmt(EventFlowParser.Platform_stmtContext ctx) {
        if (ctx.value(1) != null) {
            String templatePath = resolveValue(ctx.value(0));
            String outputPath = resolveValue(ctx.value(1));

            // Linha de depuração para confirmar o caminho absoluto
            System.out.println("\n[DEPURAÇÃO] A tentar ler o template do caminho absoluto: " + new File(templatePath).getAbsolutePath() + "\n");

            System.out.println(" -> A tentar gerar ficheiro a partir do template: '" + templatePath + "'");
            System.out.println(" -> O ficheiro de saída será em: '" + outputPath + "'");

            try {
                String templateContent = new String(Files.readAllBytes(Paths.get(templatePath)));
                System.out.println("    -> Template lido com sucesso.");

                String finalContent = substitutePlaceholders(templateContent);

                System.out.println("\n--- CONTEÚDO FINAL A SER ESCRITO ---");
                System.out.println(finalContent);
                System.out.println("-------------------------------------\n");

                writeFile(outputPath, finalContent);
            } catch (IOException e) {
                System.err.println("!!! ERRO CRÍTICO ao ler o ficheiro de template: " + templatePath);
                System.err.println("    Certifique-se que o ficheiro existe e que o programa está a ser executado no diretório correto.");
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public Object visitPipeline_def(EventFlowParser.Pipeline_defContext ctx) {
        System.out.println("\n[Interpretador] A processar bloco PIPELINE...");
        return visitChildren(ctx);
    }

    @Override
    public Object visitStage_def(EventFlowParser.Stage_defContext ctx) {
        System.out.println(" -> A executar STAGE: " + ctx.STRING().getText());
        return visitChildren(ctx);
    }

    @Override
    public Object visitRun_stmt(EventFlowParser.Run_stmtContext ctx) {
        String rawCommand = resolveValue(ctx.value());
        String finalCommand = substitutePlaceholders(rawCommand);
        System.out.printf("    - A executar Comando: '%s'\n", finalCommand);
        return null;
    }

    private String resolveValue(EventFlowParser.ValueContext ctx) {
        if (ctx.literal() != null) {
            return ctx.literal().getText().replace("\"", "");
        }
        if (ctx.ID() != null && ctx.getChildCount() > 1) { // Acesso a config.VARIAVEL
            String varName = ctx.ID(1).getText();
            Symbol symbol = symbolTable.resolve(varName);
            if (symbol != null) {
                return symbol.value.toString();
            }
            return "ERRO_VARIAVEL_NAO_ENCONTRADA";
        }
        return ctx.getText().replace("\"", ""); // Fallback
    }

    private void writeFile(String path, String content) {
        try {
            File file = new File(path);
            File parentDir = file.getParentFile();
            if (parentDir != null) {
                System.out.println("    -> A garantir que o diretório '" + parentDir.getPath() + "' existe...");
                parentDir.mkdirs();
            }

            try (FileWriter writer = new FileWriter(file)) {
                writer.write(content);
                System.out.println("    -> SUCESSO! Ficheiro '" + path + "' foi escrito.");
            }
        } catch (IOException e) {
            System.err.println("!!! ERRO CRÍTICO ao escrever o ficheiro: " + path);
            e.printStackTrace();
        }
    }
}