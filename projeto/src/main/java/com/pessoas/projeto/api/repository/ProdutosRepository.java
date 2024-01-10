package com.pessoas.projeto.api.repository;

import com.pessoas.projeto.api.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {
}
