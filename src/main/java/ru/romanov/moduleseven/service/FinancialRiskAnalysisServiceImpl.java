package ru.romanov.moduleseven.service;

import org.springframework.stereotype.Service;
import ru.romanov.moduleseven.domain.CreditProduct;
import ru.romanov.moduleseven.domain.CreditDocument;

@Service
public class FinancialRiskAnalysisServiceImpl implements FinancialRiskAnalysisService {

    @Override
    public CreditDocument analyze(CreditDocument creditDocument) {
        CreditProduct product = creditDocument.getCreditProduct();
        double k = 0;
        int k1 = 0, k2 = 0, k3 = 0;

        Double borLastIncome = creditDocument.getBorrowerLastYearIncome();
        Double prodBorLastIncome = product.getMinBorrowerLastYearIncome();
        Double lastIncomeRate = borLastIncome/prodBorLastIncome;
        if (lastIncomeRate >= 2) {
            k1 = 2;
        } else if (lastIncomeRate >= 1.5) {
            k1 = 1;
        }

        Double borFpAge = creditDocument.getFirstPersonAge();
        Double prodFpMinAge = product.getMinFirstPersonAge();
        Double prodFpMaxAge = product.getMaxFirstPersonAge();
        Double prodAgeDelta = prodFpMaxAge - prodFpMinAge;
        if(borFpAge >= (prodFpMinAge + 0.65 * prodAgeDelta)) {
            k2 = 2;
        } else if (borFpAge >= (prodFpMinAge + 0.3 * prodAgeDelta)) {
            k2 = 1;
        }

        Double borFpExperience = creditDocument.getFirstPersonExperience();
        Double prodFpExperience = product.getMinFirstPersonExperience();
        Double fpExperienceRate = borFpExperience/prodFpExperience;
        if (fpExperienceRate >= 3.0) {
            k3 = 2;
        } else if (fpExperienceRate >= 2.0) {
            k3 = 1;
        }

        k = (k1 + k2 + k3)/6.0;

        Double prodMaxSum = product.getMaxSum();
        Double prodMinSum = product.getMinSum();
        Double approvedSum = prodMinSum + (prodMaxSum - prodMinSum)*k;
        creditDocument.setApprovedSum(approvedSum);

        Double prodMaxPercent = product.getMaxPercent();
        Double prodMinPercent = product.getMinPercent();
        Double approvedPercent = prodMinPercent + (prodMaxPercent - prodMinPercent)*k;
        creditDocument.setApprovedPercent(approvedPercent);

        Double prodMaxTerm = product.getMaxTerm();
        Double prodMinTerm = product.getMinTerm();
        Double approvedTerm = prodMinTerm + (prodMaxTerm - prodMinTerm)*k;
        creditDocument.setApprovedTerm(approvedTerm);

        return creditDocument;
    }
}
