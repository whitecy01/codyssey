package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbConnectionTest {
    private static final String URL = "jdbc:postgresql://localhost:5432/jdbc_demo";
    private static final String USER = "postgres";
    private static final String PASSWORD = "1234";

    public static void main(String[] args) {
        // 1) 연결 테스트
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("DB 연결 성공");

            // 2) 간단 쿼리 테스트 (DB 버전 출력)
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT version()")) {

                if (rs.next()) {
                    System.out.println("DB Version: " + rs.getString(1));
                }
            }

        } catch (Exception e) {
            System.out.println("DB 연결 실패");
            e.printStackTrace();
        }
    }
}
