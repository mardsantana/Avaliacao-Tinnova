package br.com.tinnova.avalicao_tinnova.desafio1_eleicao.application.api;

import br.com.tinnova.avalicao_tinnova.desafio1_eleicao.application.service.EleicaoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class EleicaoController implements EleicaoAPI {

    private final EleicaoService eleicaoService;

    @Override
    public EleicaoResponse calcularPercentuais(@RequestBody @Valid EleicaoRequest request) {
        log.debug("[start] EleicaoController - calcularPercentuais: {}", request);
        EleicaoResponse response = eleicaoService.calcularPercentuais(request);
        log.debug("[finish] EleicaoController - calcularPercentuais: {}", response);
        return response;
    }
}
