package br.com.idsolucoesdigitais.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.idsolucoesdigitais.brewer.model.Estilo;

public interface EstiloRepository extends JpaRepository<Estilo, Long> {

}
