package br.com.lramos.astronomy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.lramos.astronomy.business.PlanetaBusiness;

@Controller
@RequestMapping(CalculadoraIdadePlanetas.ASTRONOMY_IDADE)
public class CalculadoraIdadePlanetas {

	public static final String ASTRONOMY_IDADE = "/astronomy/br/idade";
	
	private static final String PAGINA_IDADE = "idade";
	
	@Autowired
	PlanetaBusiness planetaBusiness;
	
	@GetMapping
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView(PAGINA_IDADE);
		
		mv.addObject("planetas", planetaBusiness.listaTodos());
		
		return mv;
	}
	
}
