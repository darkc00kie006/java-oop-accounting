package com.cjc.accounting;

public class AccountingReport {
    private double income;
    private double expenses;

    public AccountingReport(double income, double expenses) {
        this.income = income;
        this.expenses = expenses;
    }

    public void generateReport() {
        double balance = income - expenses;
        System.out.println("\nFinancial Report: Income = " + income + ", Expenses = " + expenses + ", Balance = " + balance);
    }
}
