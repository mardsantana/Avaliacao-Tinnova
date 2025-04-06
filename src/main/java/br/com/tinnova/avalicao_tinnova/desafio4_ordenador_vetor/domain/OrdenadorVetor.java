package br.com.tinnova.avalicao_tinnova.desafio4_ordenador_vetor.domain;

import lombok.*;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OrdenadorVetor {

    private List<Integer> vetor;

    public static List<Integer> ordenar(List<Integer> numeros) {
        return numeros.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
