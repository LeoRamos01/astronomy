package br.com.lramos.astronomy.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lramos.astronomy.business.SateliteBusiness;
import br.com.lramos.astronomy.controller.SateliteController;
import br.com.lramos.astronomy.entity.SateliteEntity;

@RestController
@RequestMapping(SateliteController.ASTRONOMY_BR_SATELITES)
public class SateliteRestController {
	
	@Autowired
	private SateliteBusiness business;
	
	@GetMapping("/listar")
	public List<SateliteEntity> listar() {
		return business.listaTodos();
	}

}
