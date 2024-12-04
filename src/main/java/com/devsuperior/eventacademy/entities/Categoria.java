package com.devsuperior.eventacademy.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Categoria")
public record Categoria(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Integer id,
        String descricao,
        @OneToMany(mappedBy = "categoria")
        List<Atividade> atividades) implements Serializable {

    public Categoria(
            Integer id, String descricao,
            List<Atividade> atividades) {
        this.id = id;
        this.descricao = descricao;
        this.atividades = new ArrayList<>();;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Categoria categoria = (Categoria) o;
        return Objects.equals(id, categoria.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
