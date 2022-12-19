package br.edu.infnet.pessoa.modelo.services;

import br.edu.infnet.pessoa.modelo.entidades.Pessoa;
import br.edu.infnet.pessoa.modelo.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> getAll(){
        return (List<Pessoa>) pessoaRepository.findAll();
    }
}
