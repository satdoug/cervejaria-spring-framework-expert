package br.com.idsolucoesdigitais.brewer.controllers.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.idsolucoesdigitais.brewer.service.exception.NomeEstiloJaCadastradoException;

@ControllerAdvice
public class ControllerAdviceExceptionHandler {
	
	@ExceptionHandler(NomeEstiloJaCadastradoException.class)
	public ResponseEntity<String> handlerNomeEstiloJaCadastradoException(NomeEstiloJaCadastradoException e) {
		return ResponseEntity.badRequest().body(e.getMessage());
	}

}
