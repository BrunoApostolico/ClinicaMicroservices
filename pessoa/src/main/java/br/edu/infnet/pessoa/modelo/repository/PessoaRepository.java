package br.edu.infnet.pessoa.modelo.repository;

import br.edu.infnet.pessoa.modelo.entidades.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Long> {

}
