package com.teste_git_flow.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "EXPERIENCIA_PROFISSIONAL")
public class ExpProfissional {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_EXPERIENCIA_PROFISSIONAL", nullable = false)
    private Long id;

    private String TpExperiencia;

    private String empresa;

    private String dtEntrada;

    private String dtSaida;

    private String cargo;

    private String atividades;

    private String anexoExperiencia;
}
