package com.teste_git_flow.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "CURSOS_COMPLEMENTARES")
public class CursosComplementares {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_CURSOS_COMPLEMENTARES", nullable = false)
    private Long id;

    private String nomeCurso;

    private String instituicaoEnsino;

    private String cargaHoraria;

    private String dtConclusao;

    private String anexoCurso;


}
