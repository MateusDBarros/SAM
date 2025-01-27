package com.example.SAM.Consulta.Model;

import java.time.LocalDateTime;

public class ConsultaDTO {
    private int id;
    private LocalDateTime data;
    private String nomePaciente;
    private String nomeMedico;
    private String status;


    public ConsultaDTO(int id, LocalDateTime data, String nomePaciente, String nomeMedico, String status) {
        this.id = id;
        this.data = data;
        this.nomePaciente = nomePaciente;
        this.nomeMedico = nomeMedico;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
