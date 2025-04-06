package br.com.tinnova.avalicao_tinnova.desafio5_veiculo.application.api;

import br.com.tinnova.avalicao_tinnova.desafio5_veiculo.domain.Veiculo;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public class VeiculoResponse {
    UUID idVeiculo;
    String veiculo;
    String marca;
    Integer ano;
    String descricao;
    String cor;
    boolean vendido;
    LocalDateTime dataCriacao;
    LocalDateTime dataAtualizacao;

    public VeiculoResponse(Veiculo salvo) {
        this.idVeiculo = salvo.getIdVeiculo();
        this.veiculo = salvo.getVeiculo();
        this.marca = salvo.getMarca();
        this.ano = salvo.getAno();
        this.descricao = salvo.getDescricao();
        this.cor = salvo.getCor();
        this.vendido = salvo.getVendido();
        this.dataCriacao = salvo.getDataCriacao();
        this.dataAtualizacao = salvo.getDataAtualizacao();
    }
}
