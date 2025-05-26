package com.cjc.accounting;

public class Payment {
    private String paymentID;
    private acc_Student student;
    private double amountPaid;

    public Payment(String paymentID, acc_Student student, double amountPaid) {
        this.paymentID = paymentID;
        this.student = student;
        this.amountPaid = amountPaid;
    }

    public void processPayment() {
    	System.out.println("\nPayment ID: " + paymentID + " processed.");
        student.payFees(amountPaid);
    }

	public String getPaymentID() {
		return paymentID;
	}
}
