package br.com.lramos.astronomy.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
	private SateliteBusiness sateliteBusiness;

	@GetMapping
	public ModelAndView listar(@RequestParam("page") Optional<Integer> page,
			@RequestParam("size") Optional<Integer> size) {

		ModelAndView model = new ModelAndView(SATELLITE_PAGES);

		Page<SateliteEntity> satelites = sateliteBusiness.listaTodos(page, size);
		model.addObject(SATELLITE_PAGES, satelites);
		
		addPageNumbers(model, satelites);

		return model;
	}

	@GetMapping("{id}")
	public ModelAndView listarPorPlaneta(@PathVariable("id") PlanetEntity id,
			@RequestParam("page") Optional<Integer> page, @RequestParam("size") Optional<Integer> size) {
		ModelAndView model = new ModelAndView(SATELLITE_PAGES);

		Page<SateliteEntity> satelites = sateliteBusiness.listaTodosPorPlaneta(id, page, size);
		model.addObject(SATELLITE_PAGES, satelites);
		model.addObject("planeta", id);
		
        addPageNumbers(model, satelites);

		return model;
	}

	private void addPageNumbers(ModelAndView model, Page<SateliteEntity> satelites) {
		int atual = satelites.getNumber();
		int totalPages = satelites.getTotalPages();
		
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(0, totalPages)
                .boxed()
                .collect(Collectors.toList());
            
            pageNumbers.add(0, -1);
            
            model.addObject("pageNumbers", pageNumbers);
        }
        
        model.addObject("atual", atual);
	}

}
