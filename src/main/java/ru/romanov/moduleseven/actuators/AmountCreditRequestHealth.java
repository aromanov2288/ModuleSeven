package ru.romanov.moduleseven.actuators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
import ru.romanov.moduleseven.repository.CreditDocumentRepository;

import java.util.Calendar;

@Component
public class AmountCreditRequestHealth implements HealthIndicator {

    private CreditDocumentRepository repository;

    @Autowired
    public AmountCreditRequestHealth(CreditDocumentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Health health() {
        Calendar moment = Calendar.getInstance();
        moment.set(Calendar.MINUTE, moment.get(Calendar.MINUTE) - 5);
        int count = repository.getLastReqCount(moment);
        if (count < 3) {
            return Health.down().build();
        } else {
            return Health.up().build();
        }
    }
}
