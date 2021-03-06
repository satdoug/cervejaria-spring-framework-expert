package br.com.idsolucoesdigitais.brewer.controllers;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.idsolucoesdigitais.brewer.model.Cerveja;
import br.com.idsolucoesdigitais.brewer.model.enuns.Origem;
import br.com.idsolucoesdigitais.brewer.model.enuns.Sabor;
import br.com.idsolucoesdigitais.brewer.service.CervejaService;
import br.com.idsolucoesdigitais.repository.EstiloRepository;


@Controller
public class CervejasController {

	@Autowired
	private EstiloRepository estiloRepository;

	@Autowired
	private CervejaService cervejaService;

	@RequestMapping("/cervejas/novo")
	public ModelAndView novo(Cerveja cerveja) {
		ModelAndView mv = new ModelAndView("cerveja/CadastroCerveja");
		mv.addObject("sabores", Sabor.values());
		mv.addObject("estilos", estiloRepository.findAll());
		mv.addObject("origens", Origem.values());
		return mv;
	}

	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
	public ModelAndView cadastrar(@Valid Cerveja cerveja, BindingResult result, Model model,
			RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return novo(cerveja);
		}

		cervejaService.salvar(cerveja);
		attributes.addFlashAttribute("mensagem", "Cerveja salva com sucesso!");
		return new ModelAndView("redirect:/cervejas/novo");
	}

}