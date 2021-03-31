package br.com.lramos.astronomy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.lramos.astronomy.business.SateliteBusiness;

@Controller
@RequestMapping(CalculadoraPesoSatelitesController.ASTRONOMY_PESO)
public class CalculadoraPesoSatelitesController {

	public static final String ASTRONOMY_PESO = "/astronomy/br/peso-luas";
	
	private static final String PAGINA_PESO = "peso-luas";
	
	@Autowired
	SateliteBusiness sateliteBusiness;
	
	@GetMapping
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView(PAGINA_PESO);
		
		mv.addObject("luas", sateliteBusiness.listaTodos());
		
		return mv;
	}
	
}