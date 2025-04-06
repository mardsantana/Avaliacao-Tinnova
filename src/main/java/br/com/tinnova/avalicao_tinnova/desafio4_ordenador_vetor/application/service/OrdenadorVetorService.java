package br.com.tinnova.avalicao_tinnova.desafio4_ordenador_vetor.application.service;

import br.com.tinnova.avalicao_tinnova.desafio4_ordenador_vetor.application.api.OrdenadorVetorRequest;
import br.com.tinnova.avalicao_tinnova.desafio4_ordenador_vetor.application.api.OrdenadorVetorResponse;

public interface OrdenadorVetorService {
    OrdenadorVetorResponse ordenar(OrdenadorVetorRequest request);
}
