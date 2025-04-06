package br.com.tinnova.avalicao_tinnova.desafio3_soma_multiplos.application.api;

import br.com.tinnova.avalicao_tinnova.desafio3_soma_multiplos.application.service.SomaMultiplosService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class SomaMultiplosController implements SomaMultiplosAPI {

    private final SomaMultiplosService service;

    @Override
    public SomaMultiplosResponse calcular(@RequestBody @Valid SomaMultiplosRequest request) {
        log.debug("[start] SomaMultiplosController - calcular: {}", request);
        SomaMultiplosResponse response = service.calcular(request);
        log.debug("[finish] SomaMultiplosController - calcular: {}", response);
        return response;
    }
}
