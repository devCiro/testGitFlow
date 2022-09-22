package com.teste_git_flow.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "ENDERECO")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_ENDERECO", nullable = false)
    private Long id;

    private String cep;

    private String uf;

    private String cidade;
}
