package ru.romanov.moduleseven.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.romanov.moduleseven.domain.CreditDocument;
import ru.romanov.moduleseven.dto.CreditRequest;
import ru.romanov.moduleseven.dto.CreditResponse;
import ru.romanov.moduleseven.service.BankService;
import ru.romanov.moduleseven.utils.Mapper;

@RestController
public class Controller {

    private final BankService bankService;

    private final Mapper mapper;

    @Autowired
    public Controller(BankService bankService, Mapper mapper) {
        this.bankService = bankService;
        this.mapper = mapper;
    }

    @PostMapping("/analyze")
    CreditResponse analyze(@RequestBody CreditRequest creditRequest) {
        CreditDocument creditDocument = mapper.mapToCreditDocument(creditRequest);
        CreditDocument analyzedCreditDocument = bankService.calculate(creditDocument);
        return mapper.mapFromCreditDocument(analyzedCreditDocument);
    }
}
