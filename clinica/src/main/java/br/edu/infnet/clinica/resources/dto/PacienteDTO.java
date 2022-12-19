package br.edu.infnet.clinica.resources.dto;

public class PacienteDTO {

    private Long codigo;
    private String email;
    private String nome;
    private String endereco;

    public PacienteDTO(){
    }

    public PacienteDTO(Long codigo, String email, String nome, String endereco) {
        super();
        this.codigo = codigo;
        this.email = email;
        this.nome = nome;
        this.endereco = endereco;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "PacienteDTO{" +
                "codigo=" + codigo +
                ", email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
