package br.com.tinnova.avalicao_tinnova.desafio3_soma_multiplos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SomaMultiplosRequest {

    @NotNull
    @Min(1)
    private Integer limite;
}
