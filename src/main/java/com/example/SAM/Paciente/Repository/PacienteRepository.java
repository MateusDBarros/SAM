package com.example.SAM.Paciente.Repository;

import com.example.SAM.Paciente.Model.Paciente;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PacienteRepository {

    private final JdbcTemplate jdbc;

    public PacienteRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void addPaciente(Paciente paciente) {
        String sql = "INSERT INTO Pacientes (name, age, type) VALUES (?, ?, ?)";
        jdbc.update(sql, paciente.getName(), paciente.getAge(), paciente.getType());
    }

    public List<Paciente> getPacientes() {
        String sql = "SELECT name, age, type FROM Pacientes";
        return jdbc.query(sql, (rs, rowNum) ->
                new Paciente(
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("type"),
                        rs.getInt("pacienteId")
                )
        );
    }

    public Paciente findById(int pacienteId) {
        String sql = "SELECT name, age, type FROM Pacientes WHERE pacienteId = ?";
        return jdbc.queryForObject(sql, new Object[]{pacienteId}, (rs, rowNum) ->
                new Paciente(
                rs.getString("name"),
                rs.getInt("age"),
                rs.getString("type"),
                rs.getInt("pacienteId")
                )
        );
    }

    public void updatePaciente(Paciente paciente) {
        String sql = "UPDATE SET name = ?, age = ?, type = ? WHERE pacienteId = ?";
        jdbc.update(sql, paciente.getName(), paciente.getAge(), paciente.getType(), paciente.getPacienteId());
    }

    public boolean existe(int id) {
        String sql = "SELECT COUNT(*) FROM Pacientes WHERE pacienteId = ?";
        Integer count = jdbc.queryForObject(sql, Integer.class, id);
        return count != null && count > 0;
    }
}
