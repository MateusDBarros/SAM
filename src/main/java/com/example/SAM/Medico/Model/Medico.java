package com.example.SAM.Medico.Model;
import com.example.SAM.Medico.Model.Especialidades;

public class Medico {

    private int medicoId;
    private String name;
    private Especialidades especialidade;
    private String crm;

    public Medico() {
    }

    public Medico(int medicoId, String name, Especialidades especialidade, String crm) {
        this.medicoId = medicoId;
        this.name = name;
        this.especialidade = especialidade;

        this.crm = crm;
    }

    public int getMedicoId() {
        return medicoId;
    }

    public String getName() {
        return name;
    }

    public Especialidades getEspecialidade() {
        return especialidade;
    }

    public String getCrm() {
        return crm;
    }


    public void setMedicoId(int medicoId) {
        this.medicoId = medicoId;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setEspecialidade(Especialidades especialidade) {
        this.especialidade = especialidade;
    }
}
