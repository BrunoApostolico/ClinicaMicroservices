package br.edu.infnet.pacientes.modelo.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String email;
    private String nome;
    private String endereco;

    public Paciente(){

    }
    public Paciente(Long codigo, String email, String nome, String endereco) {
        this.codigo = codigo;
        this.email = email;
        this.nome = nome;
        this.endereco = endereco;
    }
}
