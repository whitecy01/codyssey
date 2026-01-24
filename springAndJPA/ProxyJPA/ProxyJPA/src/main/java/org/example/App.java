package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.hibernate.Hibernate;
import org.hibernate.proxy.HibernateProxy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("pure-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        // 1. 저장
        Team team = new Team("team1");
        em.persist(team);

        Member member = new Member("member1", team);
        em.persist(member);

        em.flush();
        em.clear(); // ★ 중요: 1차 캐시 제거

        System.out.println("=== Member 조회 ===");
        Member findMember = em.find(Member.class, "member1");

        System.out.println("=== getTeam() 호출 ===");
        Team findTeam = findMember.getTeam();

        System.out.println("Team name = " + findTeam.getName());

        em.getTransaction().commit();
        em.close();
        emf.close();
    }


    // 회원과 팀 정보를 출력하는 비즈니스 로직
//    public void printUserAndTeam(String memberId){
//        Member member = em.find(Member.class, memberId);
//        Team team = member.getTeam();
//        System.out.println("회원 이름: " + member.getUsername());
//        System.out.println("소속 팀 : " + team.getName());
//    }
//    // 회원 정보만 출력하는 비즈니스 로직
//    public String printUser(String memberId){
//        Member member = em.find(Member.class, memberId);
//        System.out.println("회원 이름: " + member.getUsername());
//    }
}
