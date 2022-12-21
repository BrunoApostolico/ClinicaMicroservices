package br.edu.infnet.clinica.resources.dto;

import java.util.List;

public class AtendimentoResponseDTO {
    private PacienteDTO paciente;
    private List<PessoaDTO> listaPessoaDTO;

    public AtendimentoResponseDTO(){

    }

    public AtendimentoResponseDTO(PacienteDTO paciente, List<PessoaDTO> listaPessoaDTO) {
        super();
        this.paciente = paciente;
        this.listaPessoaDTO = listaPessoaDTO;
    }

    public PacienteDTO getPacienteDTO() {
        return paciente;
    }

    public List<PessoaDTO> getListaPessoaDTO() {
        return listaPessoaDTO;
    }
}
