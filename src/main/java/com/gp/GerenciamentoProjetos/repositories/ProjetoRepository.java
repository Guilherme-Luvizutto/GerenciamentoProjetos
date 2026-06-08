package com.gp.GerenciamentoProjetos.repositories;

import com.gp.GerenciamentoProjetos.models.ProjetoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProjetoRepository extends JpaRepository<ProjetoModel, UUID> {

    ProjetoModel findByNome(String nome);

}
