package com.teste_git_flow.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "CERTIFICACOES")
public class Certificacoes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_CERTIFICACOES", nullable = false)
    private Long id;

    private String certificacoes;

    private String instituicaoCertificadora;

    private String dtCertificacao;

    private String validadeCertificacao;

    private String anexoCertificacao;
}
