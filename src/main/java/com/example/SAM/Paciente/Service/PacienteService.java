package com.example.SAM.Paciente.Service;

import com.example.SAM.Paciente.Model.Paciente;
import com.example.SAM.Paciente.Repository.PacienteRepository;
import org.springframework.stereotype.Service;

import javax.lang.model.element.PackageElement;
import java.util.List;

@Service
public class PacienteService {

    private final PacienteRepository repository;

    public PacienteService(PacienteRepository repository) {
        this.repository = repository;
    }

    public void addPaciente(Paciente paciente) {
        if (paciente.getName() == null || paciente.getName().isEmpty())
            throw new IllegalStateException("Insira o nome do paciente!");
        if (paciente.getType() == null || paciente.getType().isEmpty())
            throw new IllegalStateException("Insira o nivel de atendimento do paciente!");
        if (paciente.getAge() < 0)
            throw new IllegalStateException("Idade do paciente deve ser igual ou maior que 0");
        repository.addPaciente(paciente);
    }

    public List<Paciente> getPacientes() {
        return repository.getPacientes();
    }


    public Paciente findPaciente(int id) {
        if (repository.existe(id))
            return repository.findById(id);
        throw new IllegalStateException("Paciente nao encontrado, verifique o ID");
    }

    public void updatePaciente(Paciente paciente) {
        if (repository.existe(paciente.getPacienteId()))
            repository.updatePaciente(paciente);
        throw new IllegalStateException("ID não encontrado");
    }
}
