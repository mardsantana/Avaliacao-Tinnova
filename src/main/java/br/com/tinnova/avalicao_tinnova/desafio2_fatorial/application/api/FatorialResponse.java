package br.com.tinnova.avalicao_tinnova.desafio2_fatorial.application.api;

import lombok.*;

import java.math.BigInteger;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FatorialResponse {

    private Integer numero;
    private BigInteger resultado;

    public static FatorialResponse from(Integer numero, BigInteger resultado) {
        return FatorialResponse.builder()
                .numero(numero)
                .resultado(resultado)
                .build();
    }
}
