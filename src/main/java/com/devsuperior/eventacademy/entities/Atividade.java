package com.devsuperior.eventacademy.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "Atividade")
public record Atividade(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Integer id,
        String nome,
        String descricao,
        Double preco,
        @ManyToOne
        @JoinColumn(name = "categoria_id")
        Categoria categoria,
        @OneToMany(mappedBy = "id.atividade")
        Set<Bloco> atividades) implements Serializable {

        public Atividade(
                Integer id, String nome, String descricao, Double preco,
                Categoria categoria,
                Set<Bloco> atividades) {
                this.id = id;
                this.nome = nome;
                this.descricao = descricao;
                this.preco = preco;
                this.categoria = categoria;
                this.atividades = new HashSet<>();;
        }

        @Override
        public boolean equals(Object o) {
                if (o == null || getClass() != o.getClass()) return false;

                Atividade atividade = (Atividade) o;
                return Objects.equals(id, atividade.id);
        }

        @Override
        public int hashCode() {
                return Objects.hashCode(id);
        }
}
