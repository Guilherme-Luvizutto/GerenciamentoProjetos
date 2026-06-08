package com.gp.GerenciamentoProjetos.controllers;

import com.gp.GerenciamentoProjetos.models.ProjetoModel;
import com.gp.GerenciamentoProjetos.services.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.UUID;

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
    public ResponseEntity<ProjetoModel> getProjetoById(@PathVariable UUID id) {
        ProjetoModel request = projetoService.findProjetoById(id);
        return ResponseEntity.ok().body(request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarProjetoById(@PathVariable UUID id) {
        projetoService.deleteProjetoById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{nome}")
    public ResponseEntity<ProjetoModel> getProjetoById(@PathVariable String nome) {
        ProjetoModel request = projetoService.findProjetoByNome(nome);
        return ResponseEntity.ok().body(request);
    }

}
