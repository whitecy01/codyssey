package org.example;

public class App {

    public static void main(String[] args) {
        MemberDAO dao = new MemberDAO();

        dao.findById(1)
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("해당 ID의 회원이 없습니다.")
                );
    }
}