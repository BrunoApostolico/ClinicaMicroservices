package br.edu.infnet.pacientes.modelo.services;

import br.edu.infnet.pacientes.modelo.entidades.Paciente;
import br.edu.infnet.pacientes.modelo.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public Paciente getByCodigo(Long codigo) {
        return pacienteRepository.findById(codigo).get();
    }
}
