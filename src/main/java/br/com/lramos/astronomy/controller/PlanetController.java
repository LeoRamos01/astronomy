package br.com.lramos.astronomy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.lramos.astronomy.business.PlanetaBusiness;
import br.com.lramos.astronomy.entity.PlanetEntity;

/**
 * @author leonardorm
 *
 */
@Controller
@RequestMapping("/astronomy/br/planetas")
public class PlanetController {
	
	private static final String PAGINA_PLANETAS = "planetas";
	
	@Autowired
	private PlanetaBusiness planetaBusiness;
	
	@GetMapping
	public ModelAndView listar() {
		ModelAndView model = new ModelAndView(PAGINA_PLANETAS);
		
		List<PlanetEntity> planetas = planetaBusiness.listaTodos();
		model.addObject(PAGINA_PLANETAS, planetas);
		
		return model;
	}
	
	@ModelAttribute("terra")
	public PlanetEntity terra () {
		return planetaBusiness.getTerra();
	}
	
}
