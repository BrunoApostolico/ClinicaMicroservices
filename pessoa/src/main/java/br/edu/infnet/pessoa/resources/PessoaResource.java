package br.edu.infnet.pessoa.resources;

import br.edu.infnet.pessoa.modelo.entidades.Pessoa;
import br.edu.infnet.pessoa.modelo.services.PessoaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaResource {

    private static Logger log = LoggerFactory.getLogger(PessoaResource.class);

    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public ResponseEntity<List<Pessoa>> getPessoas(){
        log.info("API de Pessoa");

        return ResponseEntity.ok(pessoaService.getAll());
    }
}
