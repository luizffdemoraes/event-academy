package com.devsuperior.eventacademy.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "Bloco")
public record Bloco(
        @EmbeddedId
        BlocoPK id,
        Instant inicio,
        Instant fim) implements Serializable {

    public Bloco(
            BlocoPK id, Instant inicio, Instant fim) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
    }

    public Atividade atividade() {
        return id.atividade();
    }

    public Participante participante() {
        return id.participante();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Bloco bloco = (Bloco) o;
        return Objects.equals(id, bloco.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
