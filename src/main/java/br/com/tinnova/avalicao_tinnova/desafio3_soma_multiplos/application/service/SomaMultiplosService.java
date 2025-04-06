package br.com.tinnova.avalicao_tinnova.desafio3_soma_multiplos.application.service;

import br.com.tinnova.avalicao_tinnova.desafio3_soma_multiplos.application.api.SomaMultiplosRequest;
import br.com.tinnova.avalicao_tinnova.desafio3_soma_multiplos.application.api.SomaMultiplosResponse;

public interface SomaMultiplosService {
    SomaMultiplosResponse calcular(SomaMultiplosRequest request);
}
