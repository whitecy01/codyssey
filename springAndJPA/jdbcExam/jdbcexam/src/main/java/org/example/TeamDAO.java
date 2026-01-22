package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TeamDAO {

    public Team findById(long id) {
        String sql = "SELECT id, name FROM teams WHERE id = ?";

        try (Connection conn = Db.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setLong(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Team(
                            rs.getLong("id"),
                            rs.getString("name")
                    );
                }
                return null;
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}