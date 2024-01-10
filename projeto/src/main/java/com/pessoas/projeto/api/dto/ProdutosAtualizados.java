package com.pessoas.projeto.api.dto;

import jakarta.validation.constraints.NotNull;

public record ProdutosAtualizados(
        @NotNull
        Long id,

        String nome,
        String marca,
        Float valor
) {
}
