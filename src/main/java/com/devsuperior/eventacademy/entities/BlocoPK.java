package com.devsuperior.eventacademy.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public record BlocoPK(
        @ManyToOne
        @JoinColumn(name = "participante_id")
        Participante participante,

        @ManyToOne
        @JoinColumn(name = "atividade_id")
        Atividade atividade) implements Serializable {

        @Override
        public boolean equals(Object o) {
                if (o == null || getClass() != o.getClass()) return false;

                BlocoPK blocoPK = (BlocoPK) o;
                return Objects.equals(atividade, blocoPK.atividade) && Objects.equals(participante, blocoPK.participante);
        }

        @Override
        public int hashCode() {
                int result = Objects.hashCode(participante);
                result = 31 * result + Objects.hashCode(atividade);
                return result;
        }
}
