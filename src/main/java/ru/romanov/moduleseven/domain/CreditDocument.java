package ru.romanov.moduleseven.domain;

public class CreditDocument {

    private String borrowerName;

    private Double borrowerLastYearIncome;

    private ApprovalStatus borrowerApprovalStatus;

    private String firstPersonName;

    private Double firstPersonAge;

    private Double firstPersonExperience;

    private ApprovalStatus firstPersonApprovalStatus;

    private CreditProduct creditProduct;

    private Double requestedSum;

    private Double requestedPercent;

    private Double requestedTerm;

    private Double approvedSum;

    private Double approvedPercent;

    private Double approvedTerm;

    public CreditDocument(String borrowerName, Double borrowerLastYearIncome,
                          String firstPersonName, Double firstPersonAge,
                          Double firstPersonExperience, CreditProduct creditProduct,
                          Double requestedSum, Double requestedPercent, Double requestedTerm) {
        this.borrowerName = borrowerName;
        this.borrowerLastYearIncome = borrowerLastYearIncome;
        this.firstPersonName = firstPersonName;
        this.firstPersonAge = firstPersonAge;
        this.firstPersonExperience = firstPersonExperience;
        this.creditProduct = creditProduct;
        this.requestedSum = requestedSum;
        this.requestedPercent = requestedPercent;
        this.requestedTerm = requestedTerm;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public Double getBorrowerLastYearIncome() {
        return borrowerLastYearIncome;
    }

    public ApprovalStatus getBorrowerApprovalStatus() {
        return borrowerApprovalStatus;
    }

    public void setBorrowerApprovalStatus(ApprovalStatus borrowerApprovalStatus) {
        this.borrowerApprovalStatus = borrowerApprovalStatus;
    }

    public String getFirstPersonName() {
        return firstPersonName;
    }

    public Double getFirstPersonAge() {
        return firstPersonAge;
    }

    public Double getFirstPersonExperience() {
        return firstPersonExperience;
    }

    public ApprovalStatus getFirstPersonApprovalStatus() {
        return firstPersonApprovalStatus;
    }

    public void setFirstPersonApprovalStatus(ApprovalStatus firstPersonApprovalStatus) {
        this.firstPersonApprovalStatus = firstPersonApprovalStatus;
    }

    public CreditProduct getCreditProduct() {
        return creditProduct;
    }

    public Double getRequestedSum() {
        return requestedSum;
    }

    public Double getRequestedPercent() {
        return requestedPercent;
    }

    public Double getRequestedTerm() {
        return requestedTerm;
    }

    public Double getApprovedSum() {
        return approvedSum;
    }

    public void setApprovedSum(Double approvedSum) {
        this.approvedSum = approvedSum;
    }

    public Double getApprovedPercent() {
        return approvedPercent;
    }

    public void setApprovedPercent(Double approvedPercent) {
        this.approvedPercent = approvedPercent;
    }

    public Double getApprovedTerm() {
        return approvedTerm;
    }

    public void setApprovedTerm(Double approvedTerm) {
        this.approvedTerm = approvedTerm;
    }
}
