package ru.romanov.moduleseven.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.romanov.moduleseven.domain.CreditDocument;

import java.util.Calendar;

public interface CreditDocumentRepository extends JpaRepository<CreditDocument, Long> {

    @Query("SELECT COUNT (C) FROM CreditDocument C WHERE C.saveTime > :moment")
    Integer getLastReqCount(@Param("moment") Calendar moment);
}
