package br.edu.infnet.clinica.resources.dto;

public class PessoaDTO {
       private Integer codigo;
       private String nome;
       private Integer idade;

    public PessoaDTO() {
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "PessoaDTO{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
