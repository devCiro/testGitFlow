package com.teste_git_flow.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "CANDIDATO")
public class Candidato {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_CANDIDATO", nullable = false)
    private Long id;

    private String cpf;

    private String sexo;

    private String rg;

    private String orgraoEmissor;

    private String nacionalidade;

    private String dtNascimento;


    private Candidato candidato;

}
