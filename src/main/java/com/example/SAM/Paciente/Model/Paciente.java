package com.example.SAM.Paciente.Model;

public class Paciente {

    private int pacienteId;
    private String name;
    private int age;
    private String type;

    public Paciente() {
    }

    public Paciente(String name, int age, String type, int Id) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.pacienteId = Id;
    }

    public int getPacienteId() {
        return pacienteId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public void setPacienteId(int pacienteId) {
        this.pacienteId = pacienteId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setType(String type) {
        this.type = type;
    }
}
