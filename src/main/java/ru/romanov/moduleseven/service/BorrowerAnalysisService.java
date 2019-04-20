package ru.romanov.moduleseven.service;

import ru.romanov.moduleseven.domain.CreditDocument;

public interface BorrowerAnalysisService {

    CreditDocument analyze(CreditDocument creditDocument);
}
