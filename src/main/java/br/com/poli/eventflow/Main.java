package br.com.poli.eventflow;

import br.com.poli.eventflow.EventFlowLexer;
import br.com.poli.eventflow.EventFlowParser;
import br.com.poli.eventflow.codegen.BuildVisitor;
import br.com.poli.eventflow.core.SemanticAnalyzerVisitor;
import br.com.poli.eventflow.core.SymbolTable;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Por favor, forneça o caminho para o arquivo de script .ef como argumento.");
            System.exit(1);
        }

        try {
            String filePath = args[0];
            System.out.println("Compilando arquivo: " + filePath);

            // 1. Leitura e Parsing (Sintaxe)
            CharStream input = CharStreams.fromFileName(filePath);
            EventFlowLexer lexer = new EventFlowLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            EventFlowParser parser = new EventFlowParser(tokens);
            ParseTree tree = parser.programa();

            // 2. Análise Semântica
            System.out.println("\n[Fase 1] Análise Semântica...");
            SymbolTable symbolTable = new SymbolTable();
            SemanticAnalyzerVisitor semanticVisitor = new SemanticAnalyzerVisitor(symbolTable);
            semanticVisitor.visit(tree);

            if (semanticVisitor.hasErrors()) {
                System.err.println("\nCompilação falhou devido a erros semânticos.");
                System.exit(1);
            }
            System.out.println("Análise semântica concluída com sucesso.");

            // 3. Geração de Código / Interpretação
            System.out.println("\n[Fase 2] Geração de Código e Interpretação...");
            BuildVisitor buildVisitor = new BuildVisitor(symbolTable);
            buildVisitor.visit(tree);

            System.out.println("\nProcesso concluído com sucesso!");

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}