package br.com.tinnova.avalicao_tinnova.desafio3_soma_multiplos.application.api;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/v3/multiplos")
public interface SomaMultiplosAPI {

    @PostMapping
    SomaMultiplosResponse calcular(@RequestBody @Valid SomaMultiplosRequest request);
}
