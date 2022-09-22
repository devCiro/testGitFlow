package com.teste_git_flow.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "TITULOS_DIPLOMAS")
public class TitulosDiplomas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_TITULOS_DIPLOMAS", nullable = false)
    private Long id;

    private String curso;

    private String instituicaoEnsino;

    private String dtConclusao;

    private String anexo;


}
