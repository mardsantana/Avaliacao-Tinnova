package br.com.tinnova.avalicao_tinnova.desafio3_soma_multiplos.application.api;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SomaMultiplosResponse {

    private Integer limite;
    private Integer resultado;

    public static SomaMultiplosResponse from(Integer limite, Integer resultado) {
        return SomaMultiplosResponse.builder()
                .limite(limite)
                .resultado(resultado)
                .build();
    }
}
