package br.edu.infnet.clinica.resources.dto;

import java.util.List;

public class AtendimentoResponseDTO {
    private PacienteDTO pacienteDTO;
    private List<PessoaDTO> listaPessoaDTO;

    public AtendimentoResponseDTO(){

    }

    public AtendimentoResponseDTO(PacienteDTO pacienteDTO, List<PessoaDTO> listaPessoaDTO) {
        super();
        this.pacienteDTO = pacienteDTO;
        this.listaPessoaDTO = listaPessoaDTO;
    }

    public PacienteDTO getPacienteDTO() {
        return pacienteDTO;
    }

    public List<PessoaDTO> getListaPessoaDTO() {
        return listaPessoaDTO;
    }
}
