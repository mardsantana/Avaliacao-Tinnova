package br.com.tinnova.avalicao_tinnova.desafio1_eleicao.application.service;

import br.com.tinnova.avalicao_tinnova.desafio1_eleicao.application.api.EleicaoRequest;
import br.com.tinnova.avalicao_tinnova.desafio1_eleicao.application.api.EleicaoResponse;

public interface EleicaoService {

    EleicaoResponse calcularPercentuais(EleicaoRequest request);
}
