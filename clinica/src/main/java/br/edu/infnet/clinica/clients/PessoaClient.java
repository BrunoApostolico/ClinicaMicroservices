package br.edu.infnet.clinica.clients;

import br.edu.infnet.clinica.resources.dto.PessoaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("pessoa")
public interface PessoaClient {

    @GetMapping ("/pessoas")
    ResponseEntity<List<PessoaDTO>> getPessoas();

}
