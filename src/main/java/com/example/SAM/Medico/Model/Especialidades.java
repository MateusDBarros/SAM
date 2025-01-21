package com.example.SAM.Medico.Model;

public enum Especialidades {
    CARDIOLOGIA ("Cardiologia"),
    ORTOPEDIA ("Ortopedia"),
    PEDIATRIA ("Pediatria"),
    DERMATOLOGIA ("Dermatologia"),
    GINECOLOGIA ("Ginecologia"),
    NEUROLOGIA ("Neurologia"),
    CLINICO_GERAL ("Clínio Geral");

    private final String description;

    Especialidades(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
