package br.com.tinnova.avalicao_tinnova.desafio5_veiculo.application.api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class VeiculoRequest {
    @NotBlank
    String veiculo;
    @NotBlank
    String marca;
    @NotNull
    Integer ano;
    @NotBlank
    String descricao;
    @NotBlank
    String cor;
    @NotNull
    Boolean vendido;
}
