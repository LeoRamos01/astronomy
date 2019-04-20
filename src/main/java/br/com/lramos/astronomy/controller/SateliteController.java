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
@RequestMapping(SateliteController.ASTRONOMY_BR_SATELITES)
public class SateliteController {

	public static final String ASTRONOMY_BR_SATELITES = "/astronomy/br/satelites";

	private static final String SATELLITE_PAGES = "satelites";
	
	@GetMapping
	public ModelAndView index() {
		return new ModelAndView(SATELLITE_PAGES);
	}
}
