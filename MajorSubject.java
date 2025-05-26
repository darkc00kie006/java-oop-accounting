package com.cjc.accounting;

public class MajorSubject extends Subject {

    public MajorSubject(String name, double fee) {
        super(name, fee);
    }

    @Override
    public String getSubjectType() {
        return "Major Subject";
    }
    
    @Override
    public double getFee() {
        return 1307.0;
    }
    
    @Override
    public String toString() {
        return " " + getFee();
    }
}
