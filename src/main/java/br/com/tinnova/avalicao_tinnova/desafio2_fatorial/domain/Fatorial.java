package br.com.tinnova.avalicao_tinnova.desafio2_fatorial.domain;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Fatorial {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idFatorial;

    private Integer numero;

    @Column(precision = 1000, scale = 0)
    private BigInteger resultado;

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

    public static BigInteger calculaFatorial(int numero) {
        BigInteger resultado = BigInteger.ONE;
        for (int i = 2; i <= numero; i++) {
            resultado = resultado.multiply(BigInteger.valueOf(i));
        }
        return resultado;
    }
}
