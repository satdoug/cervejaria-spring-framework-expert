package br.com.idsolucoesdigitais.brewer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CidadesController {

	@RequestMapping("/cidades/novo")
	public String nova() {
		return "cidade/CadastroCidade";
	}

}
