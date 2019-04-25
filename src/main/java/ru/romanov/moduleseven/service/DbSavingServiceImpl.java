package ru.romanov.moduleseven.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.romanov.moduleseven.domain.CreditDocument;
import ru.romanov.moduleseven.repository.CreditDocumentRepository;

import java.util.Calendar;

@Service
public class DbSavingServiceImpl implements DbSavingService {

    private CreditDocumentRepository repository;

    @Autowired
    public DbSavingServiceImpl(CreditDocumentRepository repository) {
        this.repository = repository;
    }

    @Override
    public CreditDocument save(CreditDocument creditDocument) {
        creditDocument.setSaveTime(Calendar.getInstance());
        return repository.save(creditDocument);
    }
}
