package br.com.lramos.astronomy.rest;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lramos.astronomy.business.SateliteBusiness;
import br.com.lramos.astronomy.controller.SateliteController;
import br.com.lramos.astronomy.entity.PlanetEntity;
import br.com.lramos.astronomy.entity.SateliteEntity;

@RestController
@RequestMapping(SateliteController.ASTRONOMY_BR_SATELITES)
public class SateliteRestController {
	
	@Autowired
	private HttpSession session;
	
	@Autowired
	private SateliteBusiness business;
	
	@GetMapping("/listar")
	public List<SateliteEntity> listar() {
		
		PlanetEntity id = (PlanetEntity) session.getAttribute("planeta");
		
		List<SateliteEntity> lista = null;
		
		if (id == null) {
			lista = business.listaTodos();
		} else {
			lista = business.listaTodosPorPlaneta(id);
		}
		
		return lista;
	}

}
