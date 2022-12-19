package br.edu.infnet.pacientes.resources;

import br.edu.infnet.pacientes.modelo.entidades.Paciente;
import br.edu.infnet.pacientes.modelo.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacienteResource {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping("/{codigo}")
    public Paciente getPaciente(@PathVariable Long codigo){
        return pacienteService.getByCodigo(codigo);
    }
}

