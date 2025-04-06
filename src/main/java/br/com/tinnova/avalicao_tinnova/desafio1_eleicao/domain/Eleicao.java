package br.com.tinnova.avalicao_tinnova.desafio1_eleicao.domain;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Eleicao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idEleicao;

    private int votosBrancos;
    private int votosNulos;
    private int votosValidos;

    private LocalDateTime dataCriacao;
    private LocalDateTime dataAlteracao;

    @PrePersist
    public void prePersist() {
        this.dataCriacao = LocalDateTime.now();
        this.dataAlteracao = this.dataCriacao;
    }

    @PreUpdate
    public void preUpdate() {
        this.dataAlteracao = LocalDateTime.now();
    }

    public int getTotalVotos() {
        return votosBrancos + votosNulos + votosValidos;
    }

    public double percentualBrancos() {
        return ((double) votosBrancos / getTotalVotos()) * 100;
    }

    public double percentualNulos() {
        return ((double) votosNulos / getTotalVotos()) * 100;
    }

    public double percentualValidos() {
        return ((double) votosValidos / getTotalVotos()) * 100;
    }
}
