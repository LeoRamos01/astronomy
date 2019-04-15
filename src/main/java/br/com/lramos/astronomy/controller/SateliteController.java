package br.com.lramos.astronomy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.lramos.astronomy.business.SateliteBusiness;
import br.com.lramos.astronomy.entity.PlanetEntity;
import br.com.lramos.astronomy.entity.SateliteEntity;

/**
 * @author leonardorm
 *
 */
@Controller
@RequestMapping(SateliteController.ASTRONOMY_BR_SATELITES)
public class SateliteController {

	static final String ASTRONOMY_BR_SATELITES = "/astronomy/br/satelites";

	private static final String SATELLITE_PAGES = "satelites";
	
	@Autowired
	private SateliteBusiness business;

	@GetMapping
	public ModelAndView listar(@RequestParam("page") Optional<Integer> page) {
		ModelAndView modelAndView = new ModelAndView(SATELLITE_PAGES);
		
		List<SateliteEntity> satelites = business.listaTodos();
		
		modelAndView.addObject(SATELLITE_PAGES, satelites);
		
		return modelAndView;
	}

	@GetMapping("{id}")
	public ModelAndView listarPorPlaneta(@PathVariable("id") PlanetEntity id) {

		ModelAndView model = new ModelAndView(SATELLITE_PAGES);

		List<SateliteEntity> satelites = business.listaTodosPorPlaneta(id);
		model.addObject(SATELLITE_PAGES, satelites);
		model.addObject("planeta", id);

		return model;
	}
	
}
