package br.com.tinnova.avalicao_tinnova.desafio4_ordenador_vetor.application.api;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/v4/ordenador")
public interface OrdenadorVetorAPI {

    @PostMapping
    OrdenadorVetorResponse ordenar(@RequestBody @Valid OrdenadorVetorRequest request);
}
