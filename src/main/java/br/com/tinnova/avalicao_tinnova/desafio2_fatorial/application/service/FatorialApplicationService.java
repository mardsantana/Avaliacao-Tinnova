package br.com.tinnova.avalicao_tinnova.desafio2_fatorial.application.service;

import br.com.tinnova.avalicao_tinnova.desafio2_fatorial.application.api.FatorialRequest;
import br.com.tinnova.avalicao_tinnova.desafio2_fatorial.application.api.FatorialResponse;
import br.com.tinnova.avalicao_tinnova.desafio2_fatorial.domain.Fatorial;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class FatorialApplicationService implements FatorialService {

    @Override
    public FatorialResponse calcular(FatorialRequest request) {
        log.debug("[start] FatorialApplicationService - calcular: {}", request);
        var resultado = Fatorial.calculaFatorial(request.getNumero());
        var response = FatorialResponse.from(request.getNumero(), resultado);
        log.debug("[finish] FatorialApplicationService - calcular: {}", response);
        return response;
    }
}
