package br.com.poli.eventflow.core;

public class Symbol {
    public final String name;
    public final String type;
    public final Object value;

    public Symbol(String name, String type, Object value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("<'%s', type: %s, value: %s>", name, type, value.toString());
    }
}