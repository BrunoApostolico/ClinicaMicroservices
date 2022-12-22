package br.edu.infnet.clinica.resources;

import br.edu.infnet.clinica.clients.PessoaClient;
import br.edu.infnet.clinica.resources.dto.AtendimentoDTO;
import br.edu.infnet.clinica.resources.dto.AtendimentoResponseDTO;
import br.edu.infnet.clinica.resources.dto.PacienteDTO;
import br.edu.infnet.clinica.resources.dto.PessoaDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class AtedimentoResource {

    private static Logger log = LoggerFactory.getLogger(AtedimentoResource.class);

    @Autowired
    private RestTemplate restTemplate;

    @Value("${paciente.endpoint.url}")
    private String pacienteApiUrl;

    @Autowired
    private PessoaClient pessoaClient;

    @PostMapping
    public AtendimentoResponseDTO efetuaAtendimento(@RequestBody AtendimentoDTO atendimentoDTO){

        log.info("Solicitação para atendimento com a informação: {}", atendimentoDTO);

        if(log.isDebugEnabled()){
            log.debug("Debug Ligado");
        }

        PacienteDTO pacienteDTO = restTemplate.getForObject(pacienteApiUrl+
                atendimentoDTO.getPacienteId(), PacienteDTO.class);

        log.info("Chamada a API de pacientes realizada: {}", pacienteDTO);

        ResponseEntity<List<PessoaDTO>> pessoas = pessoaClient.getPessoas();

        return new AtendimentoResponseDTO(pacienteDTO,pessoas.getBody());
    }
}