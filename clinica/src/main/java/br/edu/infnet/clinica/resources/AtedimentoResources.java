package br.edu.infnet.clinica.resources;

import br.edu.infnet.clinica.resources.dto.AtendimentoDTO;
import br.edu.infnet.clinica.resources.dto.PacienteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/atendimentos")
public class AtedimentoResources {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${paciente.endpoint.url}")
    private String pacienteApiUrl;

    @PostMapping
    public void efetuaAtendimento(@RequestBody AtendimentoDTO atendimentoDTO){

        PacienteDTO pacienteDTO = restTemplate.getForObject(pacienteApiUrl+
                atendimentoDTO.getPacienteId(), PacienteDTO.class);
        System.out.println(pacienteDTO);
        System.out.println(atendimentoDTO);
    }
}
