package br.edu.infnet.pacientes.modelo.repository;

import br.edu.infnet.pacientes.modelo.entidades.Paciente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends CrudRepository<Paciente, Long> {

    }

