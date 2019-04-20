package ru.romanov.moduleseven.service;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import ru.romanov.moduleseven.domain.CreditDocument;

@MessagingGateway
public interface BankService {

    @Gateway(requestChannel = "toBAS", replyChannel = "fromBank")
    CreditDocument calculate(CreditDocument creditDocument);
}
