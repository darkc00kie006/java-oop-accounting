package com.cjc.accounting;

public class MinorSubject extends Subject {

    public MinorSubject(String name, double fee) {
        super(name, fee);
    }

    @Override
    public String getSubjectType() {
        return "Minor Subject";
    }
    
    @Override
    public double getFee() {
        return 871.0;
    }
    
    @Override
    public String toString() {
    	return " " + getFee();
    }
}
