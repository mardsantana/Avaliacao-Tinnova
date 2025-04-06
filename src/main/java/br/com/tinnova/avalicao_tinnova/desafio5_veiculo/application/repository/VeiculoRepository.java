package br.com.tinnova.avalicao_tinnova.desafio5_veiculo.application.repository;

import br.com.tinnova.avalicao_tinnova.desafio5_veiculo.domain.Veiculo;

import java.util.List;
import java.util.UUID;

public interface VeiculoRepository {
    Veiculo salva(Veiculo veiculo);
    List<Veiculo> listaTodos();
    List<Veiculo> listaFiltrados(String marca, Integer ano, String cor);
    Veiculo buscaPorId(UUID idVeiculo);
    void salvarAlteracoes(Veiculo veiculo);
    void deleta(UUID idVeiculo);
}
