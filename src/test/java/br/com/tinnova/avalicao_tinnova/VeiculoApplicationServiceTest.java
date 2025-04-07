package br.com.tinnova.avalicao_tinnova;

import br.com.tinnova.avalicao_tinnova.desafio5_veiculo.application.api.VeiculoListResponse;
import br.com.tinnova.avalicao_tinnova.desafio5_veiculo.application.api.VeiculoPatchRequest;
import br.com.tinnova.avalicao_tinnova.desafio5_veiculo.application.api.VeiculoRequest;
import br.com.tinnova.avalicao_tinnova.desafio5_veiculo.application.api.VeiculoResponse;
import br.com.tinnova.avalicao_tinnova.desafio5_veiculo.application.repository.VeiculoRepository;
import br.com.tinnova.avalicao_tinnova.desafio5_veiculo.application.service.VeiculoApplicationService;
import br.com.tinnova.avalicao_tinnova.desafio5_veiculo.domain.Veiculo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;

class VeiculoApplicationServiceTest {

    @Mock
    private VeiculoRepository repository;

    @InjectMocks
    private VeiculoApplicationService service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void deveCriarVeiculoComSucesso() {
        VeiculoRequest request = new VeiculoRequest("Civic", "Honda", 2020, "Sedan", "Preto", false);
        Veiculo veiculo = new Veiculo(request);
        when(repository.salva(any(Veiculo.class))).thenReturn(veiculo);

        VeiculoResponse response = service.criaVeiculo(request);

        assertNotNull(response);
        assertEquals("Civic", response.getVeiculo());
        verify(repository).salva(any(Veiculo.class));
    }

    @Test
    void deveListarTodosOsVeiculos() {
        when(repository.listaTodos()).thenReturn(List.of(mock(Veiculo.class), mock(Veiculo.class)));

        List<VeiculoListResponse> response = service.listaTodos();

        assertEquals(2, response.size());
        verify(repository).listaTodos();
    }

    @Test
    void deveBuscarVeiculoPorId() {
        UUID id = UUID.randomUUID();
        Veiculo veiculo = mock(Veiculo.class);
        when(repository.buscaPorId(id)).thenReturn(veiculo);

        VeiculoResponse response = service.buscaPorId(id);

        assertNotNull(response);
        verify(repository).buscaPorId(id);
    }

    @Test
    void deveAtualizarVeiculoComSucesso() {
        UUID id = UUID.randomUUID();
        VeiculoRequest request = new VeiculoRequest("Civic", "Honda", 2020, "Atualizado", "Preto", false);
        Veiculo veiculo = mock(Veiculo.class);
        when(repository.buscaPorId(id)).thenReturn(veiculo);

        service.atualiza(id, request);

        verify(veiculo).atualizar(request);
        verify(repository).salvarAlteracoes(veiculo);
    }

    @Test
    void deveAtualizarParcialmenteVeiculo() {
        UUID id = UUID.randomUUID();
        Veiculo veiculo = mock(Veiculo.class);
        when(repository.buscaPorId(id)).thenReturn(veiculo);

        VeiculoPatchRequest request = new VeiculoPatchRequest("Fiesta", null, null, null, null, true);
        VeiculoResponse response = service.atualizaParcial(id, request);

        assertNotNull(response);
        verify(repository).salvarAlteracoes(veiculo);
    }

    @Test
    void deveDeletarVeiculo() {
        UUID id = UUID.randomUUID();

        service.deleta(id);

        verify(repository).deleta(id);
    }
}
