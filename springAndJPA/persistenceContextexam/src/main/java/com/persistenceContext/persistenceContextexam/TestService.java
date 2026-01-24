package com.persistenceContext.persistenceContextexam;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TestService {
    private final EntityManager em;

    @Transactional
    public void tx() {
        em.persist(new Member("재윤"));
        System.out.println("persist 완료");
    }
}
