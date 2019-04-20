package ru.romanov.moduleseven.service;

import org.springframework.stereotype.Service;
import ru.romanov.moduleseven.domain.ApprovalStatus;
import ru.romanov.moduleseven.domain.CreditProduct;
import ru.romanov.moduleseven.domain.CreditDocument;

@Service
public class BorrowerAnalysisServiceImpl implements BorrowerAnalysisService{

    @Override
    public CreditDocument analyze(CreditDocument creditDocument) {
        CreditProduct product = creditDocument.getCreditProduct();
        if (creditDocument.getBorrowerLastYearIncome() >= product.getMinBorrowerLastYearIncome()) {
            creditDocument.setBorrowerApprovalStatus(ApprovalStatus.APPROVED);
        } else {
            creditDocument.setBorrowerApprovalStatus(ApprovalStatus.NOT_APPROVED);
        }
        return creditDocument;
    }
}
