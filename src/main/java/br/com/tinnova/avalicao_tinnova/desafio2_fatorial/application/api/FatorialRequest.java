package br.com.tinnova.avalicao_tinnova.desafio2_fatorial.application.api;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FatorialRequest {

    @NotNull
    @Min(0)
    private Integer numero;
}
