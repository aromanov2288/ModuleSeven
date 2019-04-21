package ru.romanov.moduleseven.service;

import org.springframework.stereotype.Service;
import ru.romanov.moduleseven.domain.ApprovalStatus;
import ru.romanov.moduleseven.domain.CreditProduct;
import ru.romanov.moduleseven.domain.CreditDocument;

@Service
public class FirstPersonAnalysisServiceImpl implements FirstPersonAnalysisService {

    @Override
    public CreditDocument analyze(CreditDocument creditDocument) {
        CreditProduct product = creditDocument.getCreditProduct();
        if (creditDocument.getFirstPersonAge() >= product.getMinFirstPersonAge()
                && creditDocument.getFirstPersonAge() <= product.getMaxFirstPersonAge()
                && creditDocument.getFirstPersonExperience() >= product.getMinFirstPersonExperience()) {
            creditDocument.setFirstPersonApprovalStatus(ApprovalStatus.APPROVED);
        } else {
            creditDocument.setFirstPersonApprovalStatus(ApprovalStatus.NOT_APPROVED);
        }
        return creditDocument;
    }
}
