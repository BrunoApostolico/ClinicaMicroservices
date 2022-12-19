package br.edu.infnet.clinica.resources.dto;

import java.util.List;

public class AtendimentoDTO {

    private Integer pacienteId;
    private List<PessoaDTO> pessoas;


    public Integer getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Integer pacienteId) {
        this.pacienteId = pacienteId;
    }

    public List<PessoaDTO> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<PessoaDTO> pessoas) {
        this.pessoas = pessoas;
    }

    @Override
    public String toString() {
        return "AtendimentoDTO{" +
                "pacienteId=" + pacienteId +
                ", pessoas=" + pessoas +
                '}';
    }
}
