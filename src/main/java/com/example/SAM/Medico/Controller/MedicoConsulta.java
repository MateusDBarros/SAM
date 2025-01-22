package com.example.SAM.Medico.Controller;

import com.example.SAM.Medico.Model.Medico;
import com.example.SAM.Medico.Service.MedicoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoConsulta {

    private final MedicoService services;

    public MedicoConsulta(MedicoService services) {
        this.services = services;
    }

    @PostMapping
    public ResponseEntity<String> addMedico(@RequestBody Medico medico) {
        services.addMedico(medico);
        return ResponseEntity.status(HttpStatus.CREATED).body("Novo medico adicionado com sucesso!");
    }

    @GetMapping
    public ResponseEntity<List<Medico>> getMedicos() {
        List<Medico> medicoList = services.getMedicos();
        return ResponseEntity.status(HttpStatus.OK).body(medicoList);
    }

    @GetMapping("/{medicoId}")
    public ResponseEntity<Medico> findMedico(@PathVariable int medicoId) {
        Medico medico = services.findById(medicoId);
        return ResponseEntity.status(HttpStatus.OK).body(medico);
    }

    @PutMapping("/{medicoId}")
    public ResponseEntity<String> updateMedico(@RequestBody Medico medico, @PathVariable int id) {
        medico.setMedicoId(id);
        services.updateMedico(medico);
        return ResponseEntity.status(HttpStatus.OK).body("Medico com ID: " +id+ " atualizado com sucesso!");
    }
}
