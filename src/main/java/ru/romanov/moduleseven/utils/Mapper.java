package ru.romanov.moduleseven.utils;

import org.springframework.stereotype.Service;
import ru.romanov.moduleseven.domain.ApprovalStatus;
import ru.romanov.moduleseven.domain.CreditDocument;
import ru.romanov.moduleseven.domain.CreditProduct;
import ru.romanov.moduleseven.dto.CreditRequest;
import ru.romanov.moduleseven.dto.CreditResponse;

@Service
public class Mapper {

    public CreditDocument mapToCreditDocument(CreditRequest creditRequest) {
        return new CreditDocument(creditRequest.getBorrowerName(), creditRequest.getBorrowerLastYearIncome(),
                        creditRequest.getFirstPersonName(), creditRequest.getFirstPersonAge(),
                        creditRequest.getFirstPersonExperience(),
                        CreditProduct.valueOfName(creditRequest.getCreditProductName()), creditRequest.getRequestedSum(),
                        creditRequest.getRequestedPercent(), creditRequest.getRequestedTerm());
    }

    public CreditResponse mapFromCreditDocument(CreditDocument creditDocument){
        CreditResponse creditResponse
                = new CreditResponse(creditDocument.getBorrowerName(), creditDocument.getBorrowerLastYearIncome(),
                            creditDocument.getFirstPersonName(), creditDocument.getFirstPersonAge(),
                            creditDocument.getFirstPersonExperience(),
                            creditDocument.getCreditProduct().getCreditProductName());
        if (creditDocument.getBorrowerApprovalStatus().equals(ApprovalStatus.APPROVED)
                && creditDocument.getFirstPersonApprovalStatus().equals(ApprovalStatus.APPROVED)) {
            creditResponse.setIsApproved(Boolean.TRUE);
            creditResponse.setSum(creditDocument.getApprovedSum());
            creditResponse.setPercent(creditDocument.getApprovedPercent());
            creditResponse.setTerm(creditDocument.getApprovedTerm());
        } else {
            creditResponse.setIsApproved(Boolean.FALSE);
            creditResponse.setSum(creditDocument.getRequestedSum());
            creditResponse.setPercent(creditDocument.getRequestedPercent());
            creditResponse.setTerm(creditDocument.getRequestedTerm());
        }
        return creditResponse;
    }
}
