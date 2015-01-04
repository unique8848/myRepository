package com.ktw.kf.util;

/**
 * Created by kevin on 1/4/15.
 */
public enum Relation {
    EQUALS("="), LESSTHAN("<"), GREATERTHAN(">"), LIKE("LIKE");
    
    private final String value;

    Relation(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
