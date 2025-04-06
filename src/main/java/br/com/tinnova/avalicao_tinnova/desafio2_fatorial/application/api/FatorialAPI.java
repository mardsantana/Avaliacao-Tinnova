package br.com.tinnova.avalicao_tinnova.desafio2_fatorial.application.api;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/v2/fatorial")
public interface FatorialAPI {

    @PostMapping
    FatorialResponse calcular(@RequestBody @Valid FatorialRequest request);
}
