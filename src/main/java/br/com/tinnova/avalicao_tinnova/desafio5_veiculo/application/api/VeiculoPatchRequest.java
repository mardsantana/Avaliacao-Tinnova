package br.com.tinnova.avalicao_tinnova.desafio5_veiculo.application.api;

import lombok.Value;

@Value
public class VeiculoPatchRequest {
    String veiculo;
    String marca;
    Integer ano;
    String descricao;
    String cor;
    Boolean vendido;
}
