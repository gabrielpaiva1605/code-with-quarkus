package org.acme.entity;

public class Fruit {
    public String nome;
    public String descricao;

    public Long id;

    public Fruit() {
    }

    public Fruit(String name, String descricao, Long id) {
        this.nome = nome;
        this.descricao = descricao;
        this.id = id;
    }
}