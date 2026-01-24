package com.persistenceContext.persistenceContextexam;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
@RequiredArgsConstructor
public class JpaInspector implements CommandLineRunner {

    private final EntityManagerFactory emf;
    private final EntityManager em;
    private final DataSource dataSource;

    @Override
    public void run(String... args) {
        System.out.println("===== JPA Infra =====");
        System.out.println("EMF = " + emf.getClass());
        System.out.println("EM  = " + em.getClass());
        System.out.println("DS  = " + dataSource.getClass());
    }
}