package br.com.tinnova.avalicao_tinnova.desafio1_eleicao.application.service;

import br.com.tinnova.avalicao_tinnova.desafio1_eleicao.application.api.EleicaoRequest;
import br.com.tinnova.avalicao_tinnova.desafio1_eleicao.application.api.EleicaoResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class EleicaoApplicationService implements EleicaoService {

    @Override
    public EleicaoResponse calcularPercentuais(EleicaoRequest request) {
        log.debug("[start] EleicaoApplicationService - calcularPercentuais");
        EleicaoResponse response = EleicaoResponse.from(
                request.getVotosBrancos(),
                request.getVotosNulos(),
                request.getVotosValidos()
        );
        log.debug("[finish] EleicaoApplicationService - calcularPercentuais: {}", response);
        return response;
    }
}
