package br.com.lramos.astronomy.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.lramos.astronomy.entity.PlanetEntity;

/**
 * @author leonardorm
 *
 */
@Controller
@RequestMapping(SateliteController.ASTRONOMY_BR_SATELITES)
public class SateliteController {

	public static final String ASTRONOMY_BR_SATELITES = "/astronomy/br/satelites";

	private static final String SATELLITE_PAGES = "satelites";
	
	@Autowired
	private HttpSession session;
	
	@GetMapping
	public ModelAndView index() {
		return new ModelAndView(SATELLITE_PAGES);
	}
	
	@GetMapping("{id}")
	public ModelAndView satelitesPorPlaneta(PlanetEntity planeta) {
		session.setAttribute("planeta", planeta);
		return new ModelAndView(SATELLITE_PAGES);
	}
	
}
