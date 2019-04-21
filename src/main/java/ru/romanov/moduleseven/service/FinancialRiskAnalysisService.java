package ru.romanov.moduleseven.service;

import ru.romanov.moduleseven.domain.CreditDocument;

public interface FinancialRiskAnalysisService {

    CreditDocument analyze(CreditDocument creditDocument);
}
