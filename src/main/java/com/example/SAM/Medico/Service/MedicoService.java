package com.example.SAM.Medico.Service;

import com.example.SAM.Medico.Model.Medico;
import com.example.SAM.Medico.Repository.MedicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService {

    private final MedicoRepository repository;

    public MedicoService(MedicoRepository repository) {
        this.repository = repository;
    }

    public void addMedico(Medico medico) {
        if (medico.getName() == null || medico.getName().isEmpty())
            throw new IllegalStateException("Insira um nome valido para o medico.");
        if (medico.getEspecialidade() == null)
            throw new IllegalStateException("Insira uma especialidade para o medico.");
        if (medico.getCrm() == null || medico.getCrm().isEmpty())
            throw new IllegalStateException("Insira um CRM valida.");
        repository.addMedico(medico);
    }

    public List<Medico> getMedicos() {
        return repository.getMedicos();
    }

    public Medico findById(int id) {
        if (!repository.existe(id))
            throw new IllegalStateException("ID não identificado");
        return repository.findById(id);
    }
}
