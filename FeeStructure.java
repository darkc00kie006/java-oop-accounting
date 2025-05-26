package com.cjc.accounting;

import java.util.Map;

public class FeeStructure {
    private double libraryFee;
    private double labFee;
    private double researchFee;
    private double idFee;
    private double registrationFee;
    private double itInfrastructureFee;
    private double athleticsFee;
    private double medicalFee;
    private Map<String, Subject> subjectFees;

    public FeeStructure(int libraryFee, int labFee, int researchFee,
                        int idFee, int registrationFee, int itInfrastructureFee,
                        int athleticsFee, int medicalFee, Map<String, Subject> subjectFees) {
        this.libraryFee = libraryFee;
        this.labFee = labFee;
        this.researchFee = researchFee;
        this.idFee = idFee;
        this.registrationFee = registrationFee;
        this.itInfrastructureFee = itInfrastructureFee;
        this.athleticsFee = athleticsFee;
        this.medicalFee = medicalFee;
        this.subjectFees = subjectFees;
    }

    public double calculateTotalFee() {
        return libraryFee + labFee + researchFee + idFee + registrationFee +
                itInfrastructureFee + athleticsFee + medicalFee + calculateSubjectFeesTotal();
    }

    public double calculateSubjectFeesTotal() {
        return subjectFees.values().stream().mapToDouble(Subject::getFee).sum();
    }

    public Map<String, Subject> getSubjectFees() {
        return subjectFees;
    }

    public double getLibraryFee() { return libraryFee; }
    public double getLabFee() { return labFee; }
    public double getResearchFee() { return researchFee; }
    public double getIdFee() { return idFee; }
    public double getRegistrationFee() { return registrationFee; }
    public double getItInfrastructureFee() { return itInfrastructureFee; }
    public double getAthleticsFee() { return athleticsFee; }
    public double getMedicalFee() { return medicalFee; }
}
