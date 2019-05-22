package br.com.idsolucoesdigitais.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.idsolucoesdigitais.brewer.model.Cerveja;

@Repository
public interface CervejaRepository extends JpaRepository<Cerveja, Long>{
	
	

}
