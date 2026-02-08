package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import java.util.List;
import org.example.entity.Member;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // 1. EMF 생성 (이 시점에 테이블 생성)
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("pure-jpa");

        // 2. EntityManager 생성
        EntityManager em = emf.createEntityManager();

        //JPQL - TypedQuery
        TypedQuery<Member> query = em.createQuery("SELECT m FROM Member m", Member.class);
        List<Member> resultList = query.getResultList();
        for (Member member : resultList){
            System.out.println("member= " + member);
        }

        //JPQL - Query
        Query query2 = em.createQuery("SELECT m.name, m.age from Member m");
        List resultList2 = query2.getResultList();
        for (Object o : resultList2){
            Object[] result = (Object[]) o; // 결과가 둘 이상이면 Object[] 반환
            System.out.println("username = " + result[0]);
            System.out.println("age = " + result[1]);
        }

        //JPQL - 이름 기준 파라미터
        String usernameParam = "User1";

        TypedQuery<Member> query3 = em.createQuery("SELECT m FROM Member m where m.name = :name", Member.class);

        query3.setParameter("name", usernameParam);
        List<Member> resultList3 = query3.getResultList();

        //JPQL - 이름 기준 파라미터 - 연속
        String usernameParam2 = "User1";

        List<Member> query4 = em.createQuery("SELECT m FROM Member m where m.name = :name", Member.class)
                .setParameter(1, usernameParam2)
                .getResultList();


        /**
         * 사용자 생성 코드
         */
//        // 3. 트랜잭션 시작
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//
//        try {
//            // 4. Member 생성
//            Member member = new Member();
//            member.create(1L, "재윤", 25);
//
//            // 5. 저장
//            em.persist(member);
//
//            // 6. 커밋
//            tx.commit();
//
//        } catch (Exception e) {
//            tx.rollback();
//            e.printStackTrace();
//        } finally {
//            em.close();
//            emf.close();
//        }
    }
}
