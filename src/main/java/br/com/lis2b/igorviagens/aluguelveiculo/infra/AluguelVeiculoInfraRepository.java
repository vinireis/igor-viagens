package br.com.lis2b.igorviagens.aluguelveiculo.infra;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.lis2b.igorviagens.igorviagensbff.application.api.AluguelVeiculoResponse;
import br.com.lis2b.igorviagens.igorviagensbff.application.api.ViagemCotacaoRequest;
import br.com.lis2b.igorviagens.igorviagensbff.application.service.AluguelVeiculoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Repository
@RequiredArgsConstructor
@Log4j2
public class AluguelVeiculoInfraRepository implements AluguelVeiculoService {

	@Override
	public List<AluguelVeiculoResponse> buscarAlugueisVeiculos(ViagemCotacaoRequest cotacaoRequest) {
		log.info("[start] AluguelVeiculoResponse - buscarAlugueisVeiculos");
		log.info("[finish] AluguelVeiculoResponse - buscarAlugueisVeiculos");
		return null;
	}
}