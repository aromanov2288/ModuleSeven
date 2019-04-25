package ru.romanov.moduleseven.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Calendar;

@Entity
@Table(name = "credit_document")
public class CreditDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "save_time")
    private Calendar saveTime;

    @Column(name = "bor_name")
    private String borrowerName;

    @Column(name = "bor_ly_income")
    private Double borrowerLastYearIncome;

    @Column(name = "bor_appr_status")
    private ApprovalStatus borrowerApprovalStatus;

    @Column(name = "fp_name")
    private String firstPersonName;

    @Column(name = "fP_age")
    private Double firstPersonAge;

    @Column(name = "fP_experience")
    private Double firstPersonExperience;

    @Column(name = "fP_appr_status")
    private ApprovalStatus firstPersonApprovalStatus;

    @Column(name = "credit_product")
    @Enumerated(EnumType.STRING)
    private CreditProduct creditProduct;

    @Column(name = "req_sum")
    private Double requestedSum;

    @Column(name = "req_percent")
    private Double requestedPercent;

    @Column(name = "req_term")
    private Double requestedTerm;

    @Column(name = "appr_sum")
    private Double approvedSum;

    @Column(name = "appr_percent")
    private Double approvedPercent;

    @Column(name = "appr_term")
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(Calendar saveTime) {
        this.saveTime = saveTime;
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
