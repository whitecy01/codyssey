package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Optional;

public class MemberDAO {

    private final TeamDAO teamDAO = new TeamDAO();

    public Optional<Member> findById(long memberId) {
        String sql = """
                SELECT id, name, team_id
                FROM members
                WHERE id = ?
                """;

        try (Connection conn = Db.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setLong(1, memberId);

            try (ResultSet rs = ps.executeQuery()) {
                if (!rs.next()) {
                    return Optional.empty();
                }

                Long id = rs.getLong("id");
                String name = rs.getString("name");
                Long teamId = rs.getLong("team_id");

                // ⭐ 개발자가 직접 연관관계 설정
                Team team = teamDAO.findById(teamId);

                Member member = new Member(id, name, team);
                return Optional.of(member);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}