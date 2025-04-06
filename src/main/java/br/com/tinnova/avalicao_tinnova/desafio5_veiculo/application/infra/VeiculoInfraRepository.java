package br.com.tinnova.avalicao_tinnova.desafio5_veiculo.application.infra;

import br.com.tinnova.avalicao_tinnova.desafio5_veiculo.domain.Veiculo;
import br.com.tinnova.avalicao_tinnova.desafio5_veiculo.application.repository.VeiculoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class VeiculoInfraRepository implements VeiculoRepository {

    private final VeiculoSpringDataJPARepository veiculoSpringDataJPARepository;

    @Override
    public Veiculo salva(Veiculo veiculo) {
        log.debug("[start] VeiculoInfraRepository - salva");
        veiculoSpringDataJPARepository.save(veiculo);
        log.debug("[finish] VeiculoInfraRepository - salva");
        return veiculo;
    }

    @Override
    public List<Veiculo> listaTodos() {
        log.debug("[start] VeiculoInfraRepository - listaTodos");
        List<Veiculo> veiculos = veiculoSpringDataJPARepository.findAll();
        log.debug("[finish] VeiculoInfraRepository - listaTodos");
        return veiculos;
    }

    @Override
    public List<Veiculo> listaFiltrados(String marca, Integer ano, String cor) {
        log.debug("[start] VeiculoInfraRepository - listaFiltrados");

        var spec = Specification.where(VeiculoSpecification.comMarca(marca))
                .and(VeiculoSpecification.comAno(ano))
                .and(VeiculoSpecification.comCor(cor));

        List<Veiculo> veiculos = veiculoSpringDataJPARepository.findAll(spec);

        log.debug("[finish] VeiculoInfraRepository - listaFiltrados");
        return veiculos;
    }

    @Override
    public Veiculo buscaPorId(UUID id) {
        log.debug("[start] VeiculoInfraRepository - buscaPorId {}", id);
        Veiculo veiculo = veiculoSpringDataJPARepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Veículo não encontrado"));
        log.debug("[finish] VeiculoInfraRepository - buscaPorId");
        return veiculo;
    }

    @Override
    public void salvarAlteracoes(Veiculo veiculo) {
        log.debug("[start] VeiculoInfraRepository - salvarAlteracoes");
        veiculoSpringDataJPARepository.save(veiculo);
        log.debug("[finish] VeiculoInfraRepository - salvarAlteracoes");
    }

    @Override
    public void deleta(UUID id) {
        log.debug("[start] VeiculoInfraRepository - deleta {}", id);
        veiculoSpringDataJPARepository.deleteById(id);
        log.debug("[finish] VeiculoInfraRepository - deleta");
    }
}

