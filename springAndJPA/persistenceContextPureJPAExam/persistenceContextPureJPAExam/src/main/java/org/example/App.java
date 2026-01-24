package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App
{
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("pure-jpa");
    public static void main( String[] args )
    {
        Member member = createMember("memberA", "회원1");

        member.setUsername("회원명변경"); // 준영속 상태에서 변경

        mergeMember(member);


    }

    static Member createMember(String id, String username){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        Member member = new Member();
        member.setId(id);
        member.setUsername("재윤");
        member.setAge(20);

        em.persist(member);
        tx.commit();

        em.close();

        return member;
    }

    static void mergeMember(Member member){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        Member mergeMember = em.merge(member);
        tx.commit();
        //준영속 상태
        System.out.println("member = " + member.getUsername());

        //영속 상태
        System.out.println("mergeMember = " + mergeMember.getUsername());

        System.out.println("em contains member = " + em.contains(member));
        System.out.println("em contains mergeMember = " + em.contains(mergeMember));
        em.close();

    }

}
