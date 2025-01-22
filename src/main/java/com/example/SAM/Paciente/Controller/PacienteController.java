package com.example.SAM.Paciente.Controller;

import com.example.SAM.Paciente.Model.Paciente;
import com.example.SAM.Paciente.Service.PacienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    private final PacienteService services;

    public PacienteController(PacienteService services) {
        this.services = services;
    }

    @PostMapping
    public ResponseEntity<String> addPaciente(@RequestBody Paciente paciente) {
        services.addPaciente(paciente);
        return ResponseEntity.status(HttpStatus.CREATED).body("Paciente adicionado com sucesso");
    }

    @GetMapping
    public ResponseEntity<List<Paciente>> getPaciente(){
        List<Paciente> pacienteList = services.getPacientes();
        return ResponseEntity.status(HttpStatus.OK).body(pacienteList);
    }

    @GetMapping("/{pacienteID}")
    public ResponseEntity<Paciente> buscarPaciente(@PathVariable int id) {
        Paciente paciente = services.findPaciente(id);
        return ResponseEntity.status(HttpStatus.OK).body(paciente);
    }



    @PutMapping("/{pacienteId}")
    public ResponseEntity<String> updatePaciente(@RequestBody Paciente paciente, @PathVariable int id) {
        paciente.setPacienteId(id);
        services.updatePaciente(paciente);
        return ResponseEntity.status(HttpStatus.OK).body("Paciente atualizado com sucesso");
    }
}
