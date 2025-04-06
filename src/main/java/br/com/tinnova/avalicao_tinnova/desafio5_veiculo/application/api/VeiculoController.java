package br.com.tinnova.avalicao_tinnova.desafio5_veiculo.application.api;

import br.com.tinnova.avalicao_tinnova.desafio5_veiculo.application.service.VeiculoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@Log4j2
public class VeiculoController implements VeiculoAPI {

    private final VeiculoService service;

    @Override
    public VeiculoResponse criaVeiculo(VeiculoRequest request) {
        log.debug("[start] VeiculoController - criaVeiculo");
        VeiculoResponse response = service.criaVeiculo(request);
        log.debug("[finish] VeiculoController - criaVeiculo");
        return response;
    }

    @Override
    public List<VeiculoListResponse> listaFiltrados(String marca, Integer ano, String cor) {
        log.debug("[start] VeiculoController - listaFiltrados");
        List<VeiculoListResponse> response = service.listaFiltrados(marca, ano, cor);
        log.debug("[finish] VeiculoController - listaFiltrados");
        return response;
    }

    @Override
    public List<VeiculoListResponse> listaTodos() {
        log.debug("[start] VeiculoController - listaTodos");
        List<VeiculoListResponse> response = service.listaTodos();
        log.debug("[finish] VeiculoController - listaTodos");
        return response;
    }

    @Override
    public VeiculoResponse buscaPorId(UUID idVeiculo) {
        log.debug("[start] VeiculoController - buscaPorId");
        VeiculoResponse response = service.buscaPorId(idVeiculo);
        log.debug("[finish] VeiculoController - buscaPorId");
        return response;
    }

    @Override
    public void atualiza(UUID idVeiculo, VeiculoRequest request) {
        log.debug("[start] VeiculoController - atualiza");
        service.atualiza(idVeiculo, request);
        log.debug("[finish] VeiculoController - atualiza");
    }

    @Override
    public VeiculoResponse atualizaParcial(UUID idVeiculo, VeiculoPatchRequest request) {
        log.debug("[start] VeiculoController - atualizaParcial");
        VeiculoResponse response = service.atualizaParcial(idVeiculo, request);
        log.debug("[finish] VeiculoController - atualizaParcial");
        return response;
    }

    @Override
    public void deleta(UUID idVeiculo) {
        log.debug("[start] VeiculoController - deleta");
        service.deleta(idVeiculo);
        log.debug("[finish] VeiculoController - deleta");
    }
}
