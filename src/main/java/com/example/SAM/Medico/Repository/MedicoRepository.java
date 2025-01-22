package com.example.SAM.Medico.Repository;

import com.example.SAM.Medico.Model.Especialidades;
import com.example.SAM.Medico.Model.Medico;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MedicoRepository {

    private final JdbcTemplate jdbc;

    public MedicoRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void addMedico(Medico medico) {
        String sql = "INSERT INTO Medicos (name, especialidade, crm) VALUES (?,?,?)";
        jdbc.update(sql, medico.getName(), medico.getEspecialidade(), medico.getCrm());
    }

    public List<Medico> getMedicos() {
        String sql = "SELECT * FROM Medicos";
        return jdbc.query(sql, (rs, rowNum) ->
                new Medico(
                        rs.getInt("medicoId"),
                        rs.getString("name"),
                        Especialidades.valueOf(rs.getString("especialidade")),
                        rs.getString("crm")
                )
        );
    }

    public Medico findById(int id) {
        String sql = "SELECT name, especialidade, crm FROM Medicos WHERE medicoId = ?";
        return jdbc.queryForObject(sql, new Object[]{id}, (rs, rowNum) ->
                new Medico(
                        rs.getInt("medicoId"),
                        rs.getString("name"),
                        Especialidades.valueOf(rs.getString("especialidade")),
                        rs.getString("crm")
                )
        );
    }

    public void updateMedico(Medico medico) {
        String sql = "UPDATE Medicos SET name = ?, especialidade = ?, crm = ? WHERE medicoId = ?";
        jdbc.update(sql, medico.getName(), medico.getEspecialidade(), medico.getCrm());
    }

    public boolean existe(int id) {
        String sql = "SELECT COUNT(*) FROM Medicos WHERE medicosId = ?";
        Integer count = jdbc.queryForObject(sql, Integer.class, id);
        return count != null && count > 0;
    }
}
