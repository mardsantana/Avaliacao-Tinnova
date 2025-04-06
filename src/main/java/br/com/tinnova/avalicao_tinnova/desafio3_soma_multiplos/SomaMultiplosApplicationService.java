package br.com.tinnova.avalicao_tinnova.desafio3_soma_multiplos;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class SomaMultiplosApplicationService implements SomaMultiplosService {

    @Override
    public SomaMultiplosResponse calcular(SomaMultiplosRequest request) {
        log.debug("[start] SomaMultiplosApplicationService - calcular: {}", request);
        int resultado = SomaMultiplos.calcular(request.getLimite());
        SomaMultiplosResponse response = SomaMultiplosResponse.from(request.getLimite(), resultado);
        log.debug("[finish] SomaMultiplosApplicationService - calcular: {}", response);
        return response;
    }
}
