package com.teste_git_flow.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "PESSOA")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_PESSOA", nullable = false)
    private Long id;

    private String nome;

    private String email;

    private String senha;

}
