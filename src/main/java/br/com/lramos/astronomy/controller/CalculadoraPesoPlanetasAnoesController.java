package br.com.lramos.astronomy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.lramos.astronomy.business.PlanetaBusiness;

@Controller
@RequestMapping(CalculadoraPesoPlanetasAnoesController.ASTRONOMY_PESO)
public class CalculadoraPesoPlanetasAnoesController {

	public static final String ASTRONOMY_PESO = "/astronomy/br/peso-anoes";
	
	private static final String PAGINA_PESO = "peso-anoes";
	
	@Autowired
	PlanetaBusiness planetaBusiness;
	
	@GetMapping
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView(PAGINA_PESO);
		
		mv.addObject("planetas", planetaBusiness.listaTodosPlanetasAnoes());
		
		return mv;
	}
	
}