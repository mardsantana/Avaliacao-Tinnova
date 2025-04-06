package br.com.tinnova.avalicao_tinnova.desafio1_eleicao.application.api;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/v1/eleicao")
public interface EleicaoAPI {

    @PostMapping
    EleicaoResponse calcularPercentuais(@RequestBody @Valid EleicaoRequest request);
}
