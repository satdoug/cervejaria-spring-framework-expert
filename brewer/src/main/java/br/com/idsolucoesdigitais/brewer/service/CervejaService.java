package br.com.idsolucoesdigitais.brewer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.idsolucoesdigitais.brewer.model.Cerveja;
import br.com.idsolucoesdigitais.repository.CervejaRepository;

@Service
public class CervejaService {
	
	@Autowired
	private CervejaRepository cervejaRepository;
	
	@Transactional
	public void salvar(Cerveja cerveja) {
		cervejaRepository.save(cerveja);
	}

}
