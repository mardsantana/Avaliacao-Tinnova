package br.com.tinnova.avalicao_tinnova.desafio2_fatorial.application.service;

import br.com.tinnova.avalicao_tinnova.desafio2_fatorial.application.api.FatorialRequest;
import br.com.tinnova.avalicao_tinnova.desafio2_fatorial.application.api.FatorialResponse;

public interface FatorialService {
    FatorialResponse calcular(FatorialRequest request);
}
