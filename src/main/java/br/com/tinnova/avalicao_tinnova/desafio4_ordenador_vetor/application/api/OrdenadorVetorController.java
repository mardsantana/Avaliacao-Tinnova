package br.com.tinnova.avalicao_tinnova.desafio4_ordenador_vetor.application.api;

import br.com.tinnova.avalicao_tinnova.desafio4_ordenador_vetor.application.service.OrdenadorVetorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class OrdenadorVetorController implements OrdenadorVetorAPI {

    private final OrdenadorVetorService service;

    @Override
    public OrdenadorVetorResponse ordenar(@RequestBody @Valid OrdenadorVetorRequest request) {
        log.debug("[start] OrdenadorVetorController - ordenar: {}", request);
        OrdenadorVetorResponse response = service.ordenar(request);
        log.debug("[finish] OrdenadorVetorController - ordenar: {}", response);
        return response;
    }
}
