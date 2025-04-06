package br.com.tinnova.avalicao_tinnova.desafio5_veiculo.application.api;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/v5/veiculos")
public interface VeiculoAPI {

    @GetMapping("/todos")
    List<VeiculoListResponse> listaTodos();

    @GetMapping
    List<VeiculoListResponse> listaFiltrados(
            @RequestParam(required = false) String marca,
            @RequestParam(required = false) Integer ano,
            @RequestParam(required = false) String cor
    );

    @GetMapping("/{idVeiculo}")
    VeiculoResponse buscaPorId(@PathVariable UUID idVeiculo);

    @PostMapping
    VeiculoResponse criaVeiculo(@RequestBody VeiculoRequest request);

    @PutMapping("/{idVeiculo}")
    void atualiza(@PathVariable UUID idVeiculo, @RequestBody VeiculoRequest request);

    @PatchMapping("/{idVeiculo}")
    VeiculoResponse atualizaParcial(@PathVariable UUID idVeiculo, @RequestBody VeiculoPatchRequest request);

    @DeleteMapping("/{idVeiculo}")
    void deleta(@PathVariable UUID idVeiculo);
}
