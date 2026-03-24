package com.gp.GerenciamentoProjetos.Models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_projeto")
public class ProjetoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Nome Projeto")
    private String nome;
    @Column(name = "Data Início Projeto")
    private LocalDate DataInicio;
    private LocalDate DataFim;

    public ProjetoModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataInicio() {
        return DataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        DataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return DataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        DataFim = dataFim;
    }
}
