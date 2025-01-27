package com.example.SAM.Consulta.Repository;


import com.example.SAM.Consulta.Model.Consulta;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ConsultaRepository {

    private final JdbcTemplate jdbcTemplate;

    public ConsultaRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void criarConsulta(Consulta consulta) {
        String sql = "INSERT INTO Consulta (data, paciente_id, medico_id, status) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql,
                consulta.getData(),
                consulta.getPacienteId(),
                consulta.getMedicoId(),
                consulta.getStatus()
        );
    }

    public Consulta buscarPorId(int id) {
        String sql = "SELECT id, data, paciente_id, medico_id, status FROM Consulta WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, this::mapRowToConsulta);
    }

    public List<Consulta> listarConsultas() {
        String sql = "SELECT id, data, paciente_id, medico_id, status FROM Consulta";
        return jdbcTemplate.query(sql, this::mapRowToConsulta);
    }

    public void atualizarStatus(int id, String novoStatus) {
        String sql = "UPDATE Consulta SET status = ? WHERE id = ?";
        jdbcTemplate.update(sql, novoStatus, id);
    }

    public void deletarConsulta(int id) {
        String sql = "DELETE FROM Consulta WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    private Consulta mapRowToConsulta(ResultSet rs, int rowNum) throws SQLException {
        return new Consulta(
                rs.getInt("id"),
                rs.getTimestamp("data").toLocalDateTime(),
                rs.getInt("paciente_id"),
                rs.getInt("medico_id"),
                rs.getString("status")
        );
    }
}
