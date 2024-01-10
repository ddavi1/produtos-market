package com.pessoas.projeto.api.dto;

import com.pessoas.projeto.api.model.Produtos;

public record ListaProdutos(Long id, String nome, String marca, int quantidade) {


    public ListaProdutos(Produtos produtos) {
        this(produtos.getId(),
                produtos.getNome(),
                produtos.getMarca(),
                produtos.getQuantidade());
    }
}
