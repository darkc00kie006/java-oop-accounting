package com.cjc.accounting;

import java.util.Map;
import com.vsm.enroller.Student;
import com.vsm.enroller.Course.Courses;

public class acc_Student {
    private String name;
    private double totalFees;
    private double feesPaid;
    private double scholarDeductions;
    private Student student;

    public acc_Student(Student studentID, String name, Courses course, double totalFees, double downPayment, Map<String, Subject> subjectFees, Student student) {
        this.name = name;
        this.totalFees = totalFees;
        this.feesPaid = downPayment;
        this.scholarDeductions = 0;
        this.student = student;
    }

    public void payFees(double amount) {
        feesPaid += amount;
        double balance = getBalance();
        System.out.println(name + " paid " + amount + " \nRemaining balance: " + balance);
    }

    public void applyScholarship(double amount) {
        scholarDeductions += amount;
        System.out.println("\n" + name + " received a scholarship deduction of " + amount);
    }

    public double getBalance() {
        return totalFees - feesPaid - scholarDeductions;
    }

    public void displayFees(FeeStructure fees) {
        System.out.println("\n--- PAYMENT ASSESSMENT ---");
        System.out.println("\nMISCELLANEOUS FEES");
        System.out.println("Athletics Fee: " + fees.getAthleticsFee());
        System.out.println("ID Fee: " + fees.getIdFee());
        System.out.println("IT Infrastructure Fee: " + fees.getItInfrastructureFee());
        System.out.println("Library Fee: " + fees.getLibraryFee());
        System.out.println("Lab Fee: " + fees.getLabFee());
        System.out.println("Medical Fee: " + fees.getMedicalFee());
        System.out.println("Research Fee: " + fees.getResearchFee());
        System.out.println("Registration Fee: " + fees.getRegistrationFee());

        System.out.println("\nTUITION FEES:");

        // para mauna display ang ITE subs
        fees.getSubjectFees().entrySet().stream()
            .sorted((e1, e2) -> {
                boolean e1IsITE = e1.getKey().startsWith("ITE");
                boolean e2IsITE = e2.getKey().startsWith("ITE");

                if (e1IsITE && !e2IsITE) return -1;
                if (!e1IsITE && e2IsITE) return 1;
                return e1.getKey().compareTo(e2.getKey());
            })
            .forEach(entry -> System.out.println(entry.getKey() + ":  " + entry.getValue().getFee()));

        double subjectTotal = fees.calculateSubjectFeesTotal();
        double totalFee = fees.calculateTotalFee();
        System.out.println("\n" + "TOTAL SUBJECT FEE: " + subjectTotal);
        System.out.println("TOTAL TUITION FEE: " + totalFee);
        System.out.println("\n-------------------------");

        System.out.println("\n--- Enrollee Student Details ---");
        System.out.println("Student ID: " + Student.getStudentNumber());
        System.out.println("Student Name: " + name);
    }

    public void displayPaymentSummary() {
        double balance = getBalance();
        double quarter = balance / 4;
        System.out.println("\n--- Payment Summary for " + name + " ---");
        System.out.println("Initial Payment: " + feesPaid);
        System.out.println("Remaining Balance: " + balance);
        System.out.println("Quarterly Payments: " + quarter);
    }

    public Student getStudent() {
        return student;
    }
}
