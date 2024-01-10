package com.pessoas.projeto.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProdutosNomes(
        @NotBlank
        String nome,
        @NotBlank
        String marca,
        @NotNull
        int quantidade,
        @NotBlank
        String caixa,
        @NotNull
        Float valor

) {
}
