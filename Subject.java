package com.cjc.accounting;

public abstract class Subject {
    protected String name;
    protected double fee;

    public Subject(String name, double fee) {
        this.name = name;
        this.fee = fee;
    }

    public abstract String getSubjectType();

    public String getName() {
        return name;
    }

    public abstract double getFee();
}
