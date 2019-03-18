package br.com.lramos.astronomy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.lramos.astronomy.business.PlanetaBusiness;
import br.com.lramos.astronomy.entity.PlanetEntity;

/**
 * @author leonardorm
 *
 */
@Controller
@RequestMapping("/astronomy/br")
public class PlanetController {
	
	@Autowired
	private PlanetaBusiness planetaBusiness;
	
	@GetMapping
	public ModelAndView listar() {
		ModelAndView model = new ModelAndView("planetas");
		
		List<PlanetEntity> planetas = planetaBusiness.listaTodos();
		model.addObject("planetas", planetas);
		
		return model;
	}
	
}
