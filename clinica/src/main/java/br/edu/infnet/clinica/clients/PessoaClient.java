package br.edu.infnet.clinica.clients;

import br.edu.infnet.clinica.resources.dto.PessoaDTO;
import br.edu.infnet.pessoa.modelo.entidades.Pessoa;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("pessoa")
public interface PessoaClient {

    @RequestMapping("/pessoas")
    List<PessoaDTO> getPessoas();

}
