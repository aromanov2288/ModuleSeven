package ru.romanov.moduleseven.domain;

public enum CreditProduct {
    FAST_CREDIT("fastCredit", 2_000_000.0, 25.0, 60.0, 1.0, 1_000_000.0, 3_000_000.0, 10.0, 20.0, 6.0, 36.0),
    EFFICIENT_CREDIT("efficientCredit", 5_000_000.0, 30.0, 45.0, 3.0, 1_000_000.0, 7_000_000.0, 15.0, 25.0, 12.0, 60.0);

    String creditProductName;

    Double minBorrowerLastYearIncome;

    Double minFirstPersonAge;

    Double maxFirstPersonAge;

    Double minFirstPersonExperience;

    Double minSum;

    Double maxSum;

    Double minPercent;

    Double maxPercent;

    Double minTerm;

    Double maxTerm;

    CreditProduct(String creditProductName, Double minBorrowerLastYearIncome, Double minFirstPersonAge,
                  Double maxFirstPersonAge, Double minFirstPersonExperience, Double minSum, Double maxSum,
                  Double minPercent, Double maxPercent, Double minTerm, Double maxTerm) {
        this.creditProductName = creditProductName;
        this.minBorrowerLastYearIncome = minBorrowerLastYearIncome;
        this.minFirstPersonAge = minFirstPersonAge;
        this.maxFirstPersonAge = maxFirstPersonAge;
        this.minFirstPersonExperience = minFirstPersonExperience;
        this.minSum = minSum;
        this.maxSum = maxSum;
        this.minPercent = minPercent;
        this.maxPercent = maxPercent;
        this.minTerm = minTerm;
        this.maxTerm = maxTerm;
    }

    public String getCreditProductName() {
        return creditProductName;
    }

    public Double getMinBorrowerLastYearIncome() {
        return minBorrowerLastYearIncome;
    }

    public Double getMinFirstPersonAge() {
        return minFirstPersonAge;
    }

    public Double getMaxFirstPersonAge() {
        return maxFirstPersonAge;
    }

    public Double getMinFirstPersonExperience() {
        return minFirstPersonExperience;
    }

    public Double getMinSum() {
        return minSum;
    }

    public Double getMaxSum() {
        return maxSum;
    }

    public Double getMinPercent() {
        return minPercent;
    }

    public Double getMaxPercent() {
        return maxPercent;
    }

    public Double getMinTerm() {
        return minTerm;
    }

    public Double getMaxTerm() {
        return maxTerm;
    }

    public static CreditProduct valueOfName(String creditProductName) {
        for(CreditProduct creditProduct: values()) {
            if(creditProduct.getCreditProductName().equals(creditProductName)) {
                return creditProduct;
            }
        }
        return null;
    }
}
