package com.gp.GerenciamentoProjetos.Services;

import com.gp.GerenciamentoProjetos.Models.ProjetoModel;
import com.gp.GerenciamentoProjetos.Repositories.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public ProjetoModel findProjetoById(Long id) {
        return projetoRepository.findById(id).get();
    }

    public void deleteProjetoById(Long id) {
        projetoRepository.deleteById(id);
    }
}
