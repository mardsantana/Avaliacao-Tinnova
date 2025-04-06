package br.com.tinnova.avalicao_tinnova.desafio1_eleicao.application.api;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EleicaoResponse {

    private int totalVotos;
    private double percentualBrancos;
    private double percentualNulos;
    private double percentualValidos;

    public static EleicaoResponse from(int votosBrancos, int votosNulos, int votosValidos) {
        int total = votosBrancos + votosNulos + votosValidos;
        return EleicaoResponse.builder()
                .totalVotos(total)
                .percentualBrancos(((double) votosBrancos / total) * 100)
                .percentualNulos(((double) votosNulos / total) * 100)
                .percentualValidos(((double) votosValidos / total) * 100)
                .build();
    }
}
