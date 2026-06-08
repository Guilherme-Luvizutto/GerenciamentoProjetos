package com.gp.GerenciamentoProjetos.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "tb_projeto")
public class ProjetoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "Nome Projeto")
    private String nome;
    @Column(name = "Data Início Projeto")
    private LocalDate DataInicio;
    private LocalDate DataFim;

    public ProjetoModel() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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
