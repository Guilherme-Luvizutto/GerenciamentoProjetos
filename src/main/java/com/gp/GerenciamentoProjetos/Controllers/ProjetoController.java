package com.gp.GerenciamentoProjetos.Controllers;

import com.gp.GerenciamentoProjetos.Models.ProjetoModel;
import com.gp.GerenciamentoProjetos.Repositories.ProjetoRepository;
import com.gp.GerenciamentoProjetos.Services.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @PostMapping
    public ResponseEntity<ProjetoModel> salvarProjeto(@RequestBody ProjetoModel projetoModel) {
        ProjetoModel request = projetoService.salvarProjeto(projetoModel);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(projetoModel.getId()).toUri();
        return ResponseEntity.created(uri).body(request);
    }

    @GetMapping
    public ResponseEntity<List<ProjetoModel>> listarProjetos() {
        List<ProjetoModel> request = projetoService.findAllProjetos();
        return ResponseEntity.ok().body(request);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjetoModel> getProjetoById(@PathVariable Long id) {
        ProjetoModel request =  projetoService.findProjetoById(id);
        return ResponseEntity.ok().body(request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarProjetoById(@PathVariable Long id) {
        projetoService.deleteProjetoById(id);
        return ResponseEntity.noContent().build();
    }
}
