package br.com.tinnova.avalicao_tinnova.desafio5_veiculo.application.service;

import br.com.tinnova.avalicao_tinnova.desafio5_veiculo.application.api.VeiculoListResponse;
import br.com.tinnova.avalicao_tinnova.desafio5_veiculo.application.api.VeiculoPatchRequest;
import br.com.tinnova.avalicao_tinnova.desafio5_veiculo.application.api.VeiculoRequest;
import br.com.tinnova.avalicao_tinnova.desafio5_veiculo.application.api.VeiculoResponse;

import java.util.List;
import java.util.UUID;

public interface VeiculoService {

    VeiculoResponse criaVeiculo(VeiculoRequest request);
    List<VeiculoListResponse> listaTodos();
    List<VeiculoListResponse> listaFiltrados(String marca, Integer ano, String cor);
    VeiculoResponse buscaPorId(UUID idVeiculo);
    void atualiza(UUID idVeiculo, VeiculoRequest request);
    VeiculoResponse atualizaParcial(UUID idVeiculo, VeiculoPatchRequest request);
    void deleta(UUID idVeiculo);
}
