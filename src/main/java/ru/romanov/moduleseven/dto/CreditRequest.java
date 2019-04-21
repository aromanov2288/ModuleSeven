package ru.romanov.moduleseven.dto;

public class CreditRequest {

    private String borrowerName;

    private Double borrowerLastYearIncome;

    private String firstPersonName;

    private Double firstPersonAge;

    private Double firstPersonExperience;

    private String creditProductName;

    private Double requestedSum;

    private Double requestedPercent;

    private Double requestedTerm;

    public CreditRequest() {
    }

    public CreditRequest(String borrowerName, Double borrowerLastYearIncome, String firstPersonName,
                         Double firstPersonAge, Double firstPersonExperience, String creditProductName,
                         Double requestedSum, Double requestedPercent, Double requestedTerm) {
        this.borrowerName = borrowerName;
        this.borrowerLastYearIncome = borrowerLastYearIncome;
        this.firstPersonName = firstPersonName;
        this.firstPersonAge = firstPersonAge;
        this.firstPersonExperience = firstPersonExperience;
        this.creditProductName = creditProductName;
        this.requestedSum = requestedSum;
        this.requestedPercent = requestedPercent;
        this.requestedTerm = requestedTerm;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public Double getBorrowerLastYearIncome() {
        return borrowerLastYearIncome;
    }

    public void setBorrowerLastYearIncome(Double borrowerLastYearIncome) {
        this.borrowerLastYearIncome = borrowerLastYearIncome;
    }

    public String getFirstPersonName() {
        return firstPersonName;
    }

    public void setFirstPersonName(String firstPersonName) {
        this.firstPersonName = firstPersonName;
    }

    public Double getFirstPersonAge() {
        return firstPersonAge;
    }

    public void setFirstPersonAge(Double firstPersonAge) {
        this.firstPersonAge = firstPersonAge;
    }

    public Double getFirstPersonExperience() {
        return firstPersonExperience;
    }

    public void setFirstPersonExperience(Double firstPersonExperience) {
        this.firstPersonExperience = firstPersonExperience;
    }

    public String getCreditProductName() {
        return creditProductName;
    }

    public void setCreditProductName(String creditProductName) {
        this.creditProductName = creditProductName;
    }

    public Double getRequestedSum() {
        return requestedSum;
    }

    public void setRequestedSum(Double requestedSum) {
        this.requestedSum = requestedSum;
    }

    public Double getRequestedPercent() {
        return requestedPercent;
    }

    public void setRequestedPercent(Double requestedPercent) {
        this.requestedPercent = requestedPercent;
    }

    public Double getRequestedTerm() {
        return requestedTerm;
    }

    public void setRequestedTerm(Double requestedTerm) {
        this.requestedTerm = requestedTerm;
    }
}
