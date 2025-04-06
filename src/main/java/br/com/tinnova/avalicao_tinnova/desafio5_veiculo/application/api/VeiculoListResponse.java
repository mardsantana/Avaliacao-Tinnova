package br.com.tinnova.avalicao_tinnova.desafio5_veiculo.application.api;

import br.com.tinnova.avalicao_tinnova.desafio5_veiculo.domain.Veiculo;
import lombok.Getter;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Getter
public class VeiculoListResponse {
    UUID idVeiculo;
    String veiculo;
    String marca;
    Integer ano;
    String cor;
    boolean vendido;

    public VeiculoListResponse(Veiculo veiculo) {
        this.idVeiculo = veiculo.getIdVeiculo();
        this.veiculo = veiculo.getVeiculo();
        this.marca = veiculo.getMarca();
        this.ano = veiculo.getAno();
        this.cor = veiculo.getCor();
        this.vendido = veiculo.getVendido();
    }

    public static List<VeiculoListResponse> converte(List<Veiculo> lista) {
        return lista.stream().map(VeiculoListResponse::new).collect(Collectors.toList());
    }
}
