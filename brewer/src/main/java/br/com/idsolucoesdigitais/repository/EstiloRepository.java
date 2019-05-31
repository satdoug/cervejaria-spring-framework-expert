package br.com.idsolucoesdigitais.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.idsolucoesdigitais.brewer.model.Estilo;

public interface EstiloRepository extends JpaRepository<Estilo, Long> {
	
	public Optional<Estilo> findByNomeIgnoreCase(String nome);

}
