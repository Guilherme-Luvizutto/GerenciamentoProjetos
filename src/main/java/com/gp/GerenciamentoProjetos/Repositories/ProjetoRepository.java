package com.gp.GerenciamentoProjetos.Repositories;

import com.gp.GerenciamentoProjetos.Models.ProjetoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<ProjetoModel, Long> {
}
