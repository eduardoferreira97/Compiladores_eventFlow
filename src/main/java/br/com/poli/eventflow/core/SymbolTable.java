package br.com.poli.eventflow.core;

import java.util.HashMap;
import java.util.Map;

/**
 * A Tabela de Símbolos armazena todas as variáveis declaradas
 */
public class SymbolTable {
    private final Map<String, Symbol> symbols = new HashMap<>();

    public void define(Symbol symbol) {
        symbols.put(symbol.name, symbol);
    }

    public Symbol resolve(String name) {
        return symbols.get(name);
    }

    public Map<String, Symbol> getSymbols() {
        return symbols;
    }
}
