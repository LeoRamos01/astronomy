package br.com.lramos.astronomy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.lramos.astronomy.business.PlanetaBusiness;

@Controller
@RequestMapping(CalculadoraPesoController.ASTRONOMY_PESO)
public class CalculadoraPesoController {

	public static final String ASTRONOMY_PESO = "/astronomy/br/peso";
	
	private static final String PAGINA_PESO = "peso";
	
	@Autowired
	PlanetaBusiness planetaBusiness;
	
	@GetMapping
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView(PAGINA_PESO);
		
		mv.addObject("planetas", planetaBusiness.listaTodos());
		
		return mv;
	}
	
}
