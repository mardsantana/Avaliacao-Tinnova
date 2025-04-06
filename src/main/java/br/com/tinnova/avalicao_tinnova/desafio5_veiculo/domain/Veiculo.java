package br.com.tinnova.avalicao_tinnova.desafio5_veiculo.domain;

import br.com.tinnova.avalicao_tinnova.desafio5_veiculo.application.api.VeiculoRequest;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idVeiculo;

    private String veiculo;
    private String marca;
    private Integer ano;
    private String cor;
    @Column(columnDefinition = "TEXT")
    private String descricao;
    private Boolean vendido;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizacao;

    public Veiculo(VeiculoRequest request) {
        this.veiculo = request.getVeiculo();
        this.marca = request.getMarca();
        this.ano = request.getAno();
        this.cor = request.getCor();
        this.descricao = request.getDescricao();
        this.vendido = request.getVendido();
        this.dataCriacao = LocalDateTime.now();
        this.dataAtualizacao = LocalDateTime.now();
    }

    public void atualizar(VeiculoRequest request) {
        this.veiculo = request.getVeiculo();
        this.marca = request.getMarca();
        this.ano = request.getAno();
        this.cor = request.getCor();
        this.descricao = request.getDescricao();
        this.vendido = request.getVendido();
        this.dataAtualizacao = LocalDateTime.now();
    }
}
