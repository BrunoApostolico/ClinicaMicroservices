package br.edu.infnet.pessoa.resources;

import br.edu.infnet.pessoa.modelo.entidades.Pessoa;
import br.edu.infnet.pessoa.modelo.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaResource {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public List<Pessoa> getPessoas(){
        return pessoaService.getAll();
    }
}
