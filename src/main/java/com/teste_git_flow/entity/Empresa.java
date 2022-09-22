package com.teste_git_flow.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "EMPRESA")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_EMPRESA", nullable = false)
    private Long id;

    private String razaoSocialId;

    private String cnpj;

    private String cfDf;

    private Long enderecoId;

    private Integer candidatorId;
}
