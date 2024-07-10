package com.example.springboot.models;


import jakarta.persistence.*;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "TB_PRODUTOS")
public class ProductModel extends RepresentationModel<ProductModel> implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true)
    private UUID idProduto;

    @Column(name = "nome")
    private String nome;

    private BigDecimal valor;

    public UUID getIdProduct() {
        return idProduto;
    }

    public void setIdProduct(UUID idProduct) {
        this.idProduto = idProduct;
    }

    public String getName() {
        return nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValue() {
        return valor;
    }

    public void setValue(BigDecimal valor ) {
        this.valor = valor;
    }
}
