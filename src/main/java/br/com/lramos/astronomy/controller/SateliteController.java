package br.com.lramos.astronomy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.lramos.astronomy.business.SateliteBusiness;
import br.com.lramos.astronomy.entity.SateliteEntity;

/**
 * @author leonardorm
 *
 */
@Controller
@RequestMapping("/astronomy/br/satelites")
public class SateliteController {
	
	private static final String PAGINA_SATELITES = "satelites";
	
	@Autowired
	private SateliteBusiness sateliteBusiness;
	
	@GetMapping
	public ModelAndView listar() {
		ModelAndView model = new ModelAndView(PAGINA_SATELITES);
		
		List<SateliteEntity> satelites = sateliteBusiness.listaTodos();
		model.addObject(PAGINA_SATELITES, satelites);
		
		return model;
	}

}
