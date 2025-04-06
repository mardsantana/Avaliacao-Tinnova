package br.com.tinnova.avalicao_tinnova.desafio5_veiculo.application.infra;

import br.com.tinnova.avalicao_tinnova.desafio5_veiculo.domain.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface VeiculoSpringDataJPARepository extends JpaRepository<Veiculo, UUID>, JpaSpecificationExecutor<Veiculo> {
}
