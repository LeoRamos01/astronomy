package br.com.lramos.astronomy.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lramos.astronomy.business.PlanetaBusiness;
import br.com.lramos.astronomy.controller.PlanetController;
import br.com.lramos.astronomy.entity.PlanetEntity;

@RestController
@RequestMapping(PlanetController.ASTRONOMY_BR_PLANETAS)
public class PlanetRestController {
	
	@Autowired
	private PlanetaBusiness business;

	@GetMapping("/listar")
	public List<PlanetEntity> listar() {
		return business.listaTodos();
	}
	
}
