package br.com.lramos.astronomy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author leonardorm
 *
 */
@Controller
@RequestMapping(PlanetController.ASTRONOMY_BR_PLANETAS)
public class PlanetController {
	
	public static final String ASTRONOMY_BR_PLANETAS = "/astronomy/br/planetas";
	private static final String PAGINA_PLANETAS = "planetas";
	
	@GetMapping
	public ModelAndView listar() {
		return new ModelAndView(PAGINA_PLANETAS);
	}
	
}
