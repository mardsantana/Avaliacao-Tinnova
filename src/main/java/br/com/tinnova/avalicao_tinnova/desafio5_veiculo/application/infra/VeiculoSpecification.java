package br.com.tinnova.avalicao_tinnova.desafio5_veiculo.application.infra;

import br.com.tinnova.avalicao_tinnova.desafio5_veiculo.domain.Veiculo;
import org.springframework.data.jpa.domain.Specification;

public class VeiculoSpecification {

    public static Specification<Veiculo> comMarca(String marca) {
        return (root, query, builder) ->
                (marca == null || marca.isBlank()) ? null : builder.equal(root.get("marca"), marca);
    }

    public static Specification<Veiculo> comAno(Integer ano) {
        return (root, query, builder) ->
                (ano == null) ? null : builder.equal(root.get("ano"), ano);
    }

    public static Specification<Veiculo> comCor(String cor) {
        return (root, query, builder) ->
                (cor == null || cor.isBlank()) ? null : builder.equal(root.get("cor"), cor);
    }
}
