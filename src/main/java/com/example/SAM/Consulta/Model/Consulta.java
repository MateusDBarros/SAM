package com.example.SAM.Consulta.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Consulta {

    private int consultaId;
    private int pacienteId;
    private int medicoId;
    private LocalDate data;
    private String status;

    public Consulta() {
    }

    public Consulta(int consultaId, LocalDate data, int pacienteId, int medicoId, String status) {
        this.consultaId = consultaId;
        this.pacienteId = pacienteId;
        this.medicoId = medicoId;
        this.data = data;
        this.status = status;
    }

    public Consulta(int id, LocalDateTime data, int pacienteId, int medicoId, String status) {
    }

    public int getConsultaId() {
        return consultaId;
    }

    public int getPacienteId() {
        return pacienteId;
    }

    public String getStatus() {
        return status;
    }

    public int getMedicoId() {
        return medicoId;
    }

    public LocalDate getData() {
        return data;
    }

    public void setConsultaId(int consultaId) {
        this.consultaId = consultaId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setMedicoId(int medicoId) {
        this.medicoId = medicoId;
    }

    public void setPacienteId(int pacienteId) {
        this.pacienteId = pacienteId;
    }
}
