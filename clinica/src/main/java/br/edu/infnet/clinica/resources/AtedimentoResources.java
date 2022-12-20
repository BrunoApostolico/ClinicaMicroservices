package br.edu.infnet.clinica.resources;

import br.edu.infnet.clinica.clients.PessoaClient;
import br.edu.infnet.clinica.resources.dto.AtendimentoDTO;
import br.edu.infnet.clinica.resources.dto.AtendimentoResponseDTO;
import br.edu.infnet.clinica.resources.dto.PacienteDTO;
import br.edu.infnet.clinica.resources.dto.PessoaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/atendimentos")
public class AtedimentoResources {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${paciente.endpoint.url}")
    private String pacienteApiUrl;

    @Autowired
    private PessoaClient pessoaClient;

    @PostMapping
    public AtendimentoResponseDTO efetuaAtendimento(@RequestBody AtendimentoDTO atendimentoDTO){

        PacienteDTO pacienteDTO = restTemplate.getForObject(pacienteApiUrl+
                atendimentoDTO.getPacienteId(), PacienteDTO.class);
        System.out.println(pacienteDTO);
        System.out.println(atendimentoDTO);

        ResponseEntity<List<PessoaDTO>> pessoas = pessoaClient.getPessoas();
        System.out.println("foi " + pessoas.getBody());

        return new AtendimentoResponseDTO(pacienteDTO,pessoas.getBody());
    }
}