package br.com.tinnova.avalicao_tinnova.desafio4_ordenador_vetor.application.api;

import lombok.*;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OrdenadorVetorResponse {

    private List<Integer> vetorOrdenado;

    public static OrdenadorVetorResponse from(List<Integer> vetorOrdenado) {
        return OrdenadorVetorResponse.builder()
                .vetorOrdenado(vetorOrdenado)
                .build();
    }
}
