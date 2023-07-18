package br.com.lis2b.igorviagens.aluguelveiculo.infra;

import br.com.lis2b.igorviagens.aluguelveiculo.domain.AluguelVeiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AluguelVeiculoJPARepository extends JpaRepository<AluguelVeiculo, UUID> {
}
