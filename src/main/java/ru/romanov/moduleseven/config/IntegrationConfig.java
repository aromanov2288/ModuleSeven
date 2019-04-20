package ru.romanov.moduleseven.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.dsl.MessageChannels;
import ru.romanov.moduleseven.domain.ApprovalStatus;
import ru.romanov.moduleseven.domain.CreditDocument;

@Configuration
public class IntegrationConfig {

    @Bean
    public DirectChannel toBAS() {
        return MessageChannels.direct().datatype(CreditDocument.class).get();
    }

    @Bean
    public DirectChannel toBASRouter() {
        return MessageChannels.direct().datatype(CreditDocument.class).get();
    }

    @Bean
    public DirectChannel toFPAS() {
        return MessageChannels.direct().datatype(CreditDocument.class).get();
    }

    @Bean
    public DirectChannel toFRAS() {
        return MessageChannels.direct().datatype(CreditDocument.class).get();
    }

    @Bean
    public IntegrationFlow flow() {
        return IntegrationFlows
                .from("toBAS")
                .handle("borrowerAnalysisServiceImpl", "analyze")
                .channel("toBASRouter")
                .<CreditDocument, ApprovalStatus>route(
                        CreditDocument::getBorrowerApprovalStatus,
                        mappingOne -> mappingOne
                                .subFlowMapping(ApprovalStatus.APPROVED, sfOne -> sfOne
                                        .channel("toFPAS")
                                        .handle("firstPersonAnalysisServiceImpl", "analyze")
                                        .channel("toFPASRouter")
                                        .<CreditDocument, ApprovalStatus>route(
                                                CreditDocument::getFirstPersonApprovalStatus,
                                                mappingTwo -> mappingTwo
                                                        .subFlowMapping(ApprovalStatus.APPROVED, sfTwo -> sfTwo
                                                                .channel("toFRAS")
                                                                .handle("financialRiskAnalysisServiceImpl", "analyze")
                                                                .channel("fromBank"))
                                                        .subFlowMapping(ApprovalStatus.NOT_APPROVED, sfTwo -> sfTwo
                                                                .channel("fromBank"))))
                                .subFlowMapping(ApprovalStatus.NOT_APPROVED, sfOne -> sfOne
                                        .channel("fromBank"))
                ).get();
    }
}
