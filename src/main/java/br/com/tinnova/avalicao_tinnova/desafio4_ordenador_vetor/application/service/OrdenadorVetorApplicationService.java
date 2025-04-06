package br.com.tinnova.avalicao_tinnova.desafio4_ordenador_vetor.application.service;

import br.com.tinnova.avalicao_tinnova.desafio4_ordenador_vetor.application.api.OrdenadorVetorRequest;
import br.com.tinnova.avalicao_tinnova.desafio4_ordenador_vetor.application.api.OrdenadorVetorResponse;
import br.com.tinnova.avalicao_tinnova.desafio4_ordenador_vetor.domain.OrdenadorVetor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class OrdenadorVetorApplicationService implements OrdenadorVetorService {

    @Override
    public OrdenadorVetorResponse ordenar(OrdenadorVetorRequest request) {
        log.debug("[start] OrdenadorVetorApplicationService - ordenar: {}", request);
        List<Integer> ordenado = OrdenadorVetor.ordenar(request.getVetor());
        OrdenadorVetorResponse response = OrdenadorVetorResponse.from(ordenado);
        log.debug("[finish] OrdenadorVetorApplicationService - ordenar: {}", response);
        return response;
    }
}
