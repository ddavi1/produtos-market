package com.pessoas.projeto.api.controllers;


import com.pessoas.projeto.api.dto.ListaProdutos;
import com.pessoas.projeto.api.dto.ProdutosAtualizados;
import com.pessoas.projeto.api.dto.ProdutosNomes;
import com.pessoas.projeto.api.model.Produtos;
import com.pessoas.projeto.api.repository.ProdutosRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private ProdutosRepository repository;

    @GetMapping
    public List<ListaProdutos> listarProdutos() {
        return repository.findAll().stream().map(ListaProdutos::new).toList();
    }


    @PostMapping
    @Transactional
    public void cadastrarProduto(@RequestBody @Valid ProdutosNomes produtos) {
        repository.save(new Produtos (produtos));

    }

    @PutMapping
    @Transactional
    public void atualizarProduto(@RequestBody @Valid ProdutosAtualizados produtos) {

        var produtos1 = repository.getReferenceById(produtos.id());
        produtos1.atualizarProdutos(produtos);

    }

    @DeleteMapping("/{id}")
    public void deletarDado(@PathVariable Long id) {
        repository.deleteById(id);

    }


}
