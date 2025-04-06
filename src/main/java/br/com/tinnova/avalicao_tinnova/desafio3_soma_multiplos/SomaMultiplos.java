package br.com.tinnova.avalicao_tinnova.desafio3_soma_multiplos;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SomaMultiplos {

    private Integer limite;
    private Integer resultado;

    public static int calcular(int limite) {
        int soma = 0;
        for (int i = 1; i < limite; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                soma += i;
            }
        }
        return soma;
    }
}