package br.com.tinnova.avalicao_tinnova.desafio4_ordenador_vetor.application.api;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OrdenadorVetorRequest {

    @NotEmpty
    private List<Integer> vetor;
}
