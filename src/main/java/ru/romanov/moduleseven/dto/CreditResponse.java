package ru.romanov.moduleseven.dto;

public class CreditResponse {

    private Boolean isApproved;

    private String borrowerName;

    private Double borrowerLastYearIncome;

    private String firstPersonName;

    private Double firstPersonAge;

    private Double firstPersonExperience;

    private String creditProduct;

    private Double sum;

    private Double percent;

    private Double term;

    public CreditResponse(String borrowerName, Double borrowerLastYearIncome, String firstPersonName,
                          Double firstPersonAge, Double firstPersonExperience, String creditProduct) {
        this.borrowerName = borrowerName;
        this.borrowerLastYearIncome = borrowerLastYearIncome;
        this.firstPersonName = firstPersonName;
        this.firstPersonAge = firstPersonAge;
        this.firstPersonExperience = firstPersonExperience;
        this.creditProduct = creditProduct;
    }

    public Boolean getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(Boolean isApproved) {
        this.isApproved = isApproved;
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

    public String getCreditProduct() {
        return creditProduct;
    }

    public void setCreditProduct(String creditProduct) {
        this.creditProduct = creditProduct;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public Double getTerm() {
        return term;
    }

    public void setTerm(Double term) {
        this.term = term;
    }
}
