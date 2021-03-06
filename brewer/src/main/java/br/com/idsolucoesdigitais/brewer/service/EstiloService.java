package br.com.idsolucoesdigitais.brewer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.idsolucoesdigitais.brewer.model.Estilo;
import br.com.idsolucoesdigitais.brewer.service.exception.NomeEstiloJaCadastradoException;
import br.com.idsolucoesdigitais.repository.EstiloRepository;

@Service
public class EstiloService {

	@Autowired
	private EstiloRepository estiloRepository;

	@Transactional
	public Estilo salvar(Estilo estilo) {
		Optional<Estilo> estiloOptional = estiloRepository.findByNomeIgnoreCase(estilo.getNome());
		if(estiloOptional.isPresent()) {
			throw new NomeEstiloJaCadastradoException("Nome do estilo já cadastrado");
		}
		return estiloRepository.saveAndFlush(estilo);
	}
}
