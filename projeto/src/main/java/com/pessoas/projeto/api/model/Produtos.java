package com.pessoas.projeto.api.model;


import com.pessoas.projeto.api.dto.ProdutosAtualizados;
import com.pessoas.projeto.api.dto.ProdutosNomes;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.*;

@Entity (name = "Produtos")
@Table(name = "produtos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Produtos {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String marca;
    private int quantidade;
    private String caixa;
    private Float valor;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCaixa() {
        return caixa;
    }

    public void setCaixa(String caixa) {
        this.caixa = caixa;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Produtos(ProdutosNomes produtos) {

        this.nome = produtos.nome();
        this.marca = produtos.marca();
        this.quantidade = produtos.quantidade();
        this.caixa = produtos.caixa();
        this.valor = produtos.valor();
    }

    public void atualizarProdutos(@Valid ProdutosAtualizados produtosAt) {
        if (produtosAt.nome() != null) {
            this.nome = produtosAt.nome();
        }

        if (produtosAt.marca() != null) {
            this.marca = produtosAt.marca();
        }

        if (produtosAt.valor() != null) {
            this.valor = produtosAt.valor();
        }



    }
}
