package com.gp.GerenciamentoProjetos.services;

import com.gp.GerenciamentoProjetos.models.ProjetoModel;
import com.gp.GerenciamentoProjetos.repositories.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository;

    public ProjetoModel salvarProjeto(ProjetoModel projetoModel) {
        return projetoRepository.save(projetoModel);
    }

    public List<ProjetoModel> findAllProjetos() {
        return projetoRepository.findAll();
    }

    public ProjetoModel findProjetoById(UUID id) {
        return projetoRepository.findById(id).get();
    }

    public void deleteProjetoById(UUID id) {
        projetoRepository.deleteById(id);
    }

    public ProjetoModel findProjetoByNome(String nome) {
        return projetoRepository.findByNome(nome);
    }
}
