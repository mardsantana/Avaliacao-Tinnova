package br.com.tinnova.avalicao_tinnova.desafio1_eleicao.application.api;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EleicaoRequest {

    @NotNull
    @Min(0)
    private Integer votosBrancos;

    @NotNull
    @Min(0)
    private Integer votosNulos;

    @NotNull
    @Min(0)
    private Integer votosValidos;
}
