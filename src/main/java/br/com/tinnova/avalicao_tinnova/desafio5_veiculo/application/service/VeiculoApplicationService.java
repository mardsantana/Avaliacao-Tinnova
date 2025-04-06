package br.com.tinnova.avalicao_tinnova.desafio5_veiculo.application.service;

import br.com.tinnova.avalicao_tinnova.desafio5_veiculo.application.api.VeiculoListResponse;
import br.com.tinnova.avalicao_tinnova.desafio5_veiculo.application.api.VeiculoPatchRequest;
import br.com.tinnova.avalicao_tinnova.desafio5_veiculo.application.api.VeiculoRequest;
import br.com.tinnova.avalicao_tinnova.desafio5_veiculo.application.api.VeiculoResponse;
import br.com.tinnova.avalicao_tinnova.desafio5_veiculo.application.repository.VeiculoRepository;
import br.com.tinnova.avalicao_tinnova.desafio5_veiculo.domain.Veiculo;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Log4j2
public class VeiculoApplicationService implements VeiculoService {

    private final VeiculoRepository repository;

    @Override
    public VeiculoResponse criaVeiculo(VeiculoRequest request) {
        log.info("[start] VeiculoApplicationService - criaVeiculo");
        Veiculo salvo = repository.salva(new Veiculo(request));
        log.info("[finish] VeiculoApplicationService - criaVeiculo");
        return new VeiculoResponse(salvo);
    }

    @Override
    public List<VeiculoListResponse> listaTodos() {
        log.info("[start] VeiculoApplicationService - listaTodos");
        List<Veiculo> lista = repository.listaTodos();
        log.info("[finish] VeiculoApplicationService - listaTodos");
        return VeiculoListResponse.converte(lista);
    }

    @Override
    public List<VeiculoListResponse> listaFiltrados(String marca, Integer ano, String cor) {
        log.info("[start] VeiculoApplicationService - listaFiltrados");
        List<Veiculo> lista = repository.listaFiltrados(marca, ano, cor);
        log.info("[finish] VeiculoApplicationService - listaFiltrados");
        return VeiculoListResponse.converte(lista);
    }

    @Override
    public VeiculoResponse buscaPorId(UUID idVeiculo) {
        log.info("[start] VeiculoApplicationService - buscaPorId {}", idVeiculo);
        Veiculo veiculo = repository.buscaPorId(idVeiculo);
        log.info("[Finish] VeiculoApplicationService - buscaPorId {}", idVeiculo);
        return new VeiculoResponse(veiculo);
    }

    @Override
    public void atualiza(UUID idVeiculo, VeiculoRequest request) {
        log.info("[start] VeiculoApplicationService - atualiza {}", idVeiculo);
        Veiculo veiculo = repository.buscaPorId(idVeiculo);
        veiculo.atualizar(request);
        repository.salvarAlteracoes(veiculo);
        log.info("[finish] VeiculoApplicationService - atualiza {}", idVeiculo);
    }

    @Override
    public VeiculoResponse atualizaParcial(UUID idVeiculo, VeiculoPatchRequest request) {
        log.info("[start] VeiculoApplicationService - atualizaParcial {}", idVeiculo);
        Veiculo veiculo = repository.buscaPorId(idVeiculo);
        repository.salvarAlteracoes(veiculo);
        log.info("[finish] VeiculoApplicationService - atualizaParcial {}", idVeiculo);
        return new VeiculoResponse(veiculo);
    }

    @Override
    public void deleta(UUID idVeiculo) {
        log.info("[start] VeiculoApplicationService - deleta {}", idVeiculo);
        repository.deleta(idVeiculo);
        log.info("[finish] VeiculoApplicationService - deleta {}", idVeiculo);
    }
}