package com.devsuperior.eventacademy.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "Participante")
public record Participante(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Integer id,
        String nome,
        String email,
        @OneToMany(mappedBy = "id.participante")
        Set<Bloco> atividades) implements Serializable {

    public Participante(
            Integer id, String nome, String email,
            Set<Bloco> atividades) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.atividades = new HashSet<>();;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Participante that = (Participante) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
