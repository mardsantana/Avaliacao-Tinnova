package br.com.tinnova.avalicao_tinnova.desafio2_fatorial.application.api;

import br.com.tinnova.avalicao_tinnova.desafio2_fatorial.application.service.FatorialService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class FatorialController implements FatorialAPI {

    private final FatorialService fatorialService;

    @Override
    public FatorialResponse calcular(@RequestBody @Valid FatorialRequest request) {
        log.debug("[start] FatorialController - calcular: {}", request);
        FatorialResponse response = fatorialService.calcular(request);
        log.debug("[finish] FatorialController - calcular: {}", response);
        return response;
    }
}
