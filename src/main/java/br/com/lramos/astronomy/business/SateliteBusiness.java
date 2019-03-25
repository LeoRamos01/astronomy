package br.com.lramos.astronomy.business;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.lramos.astronomy.entity.PlanetEntity;
import br.com.lramos.astronomy.entity.SateliteEntity;
import br.com.lramos.astronomy.repository.SateliteRepository;

/**
 * @author leonardorm
 *
 */
@Service
public class SateliteBusiness {

	private static final int TOPO = 0;
	private static final int TAMANHO_PAGINACAO = 10;
	
	@Autowired
	private SateliteRepository sateliteRepo;
	
	private Sort sort;
	
	@PostConstruct
	public void initSort () {
		sort = Sort.by(Sort.Order.asc("planeta.distanceSun"),
			    Sort.Order.desc("radius"));
	}
	
	/**
	 * @param page
	 * @param size
	 * @return {@link List} de todos os {@link SateliteEntity}.
	 */
	public Page<SateliteEntity> listaTodos(Optional<Integer> page, Optional<Integer> size) {

		List<SateliteEntity> satelites = sateliteRepo.findAll(sort);

		Page<SateliteEntity> satellitePages = paginacao(page, size, satelites);
		
		return satellitePages;
	}

	/**
	 * @param id
	 * @param page
	 * @param size
	 * @return {@link List} de todos os {@link SateliteEntity} por {@link PlanetEntity}.
	 */
	public Page<SateliteEntity> listaTodosPorPlaneta(PlanetEntity id, Optional<Integer> page, Optional<Integer> size) {
		
		List<SateliteEntity> satelites = sateliteRepo.findAllByPlaneta(id, sort);
		
		Page<SateliteEntity> satellitePages = paginacao(page, size, satelites);
		
		return satellitePages;
	}
	
	private Page<SateliteEntity> paginacao(Optional<Integer> page, Optional<Integer> size,
			List<SateliteEntity> satelites) {
		
		List<SateliteEntity> list = null;
		
		int currentPage = page.orElse(TOPO);
		int pageSize = size.orElse(TAMANHO_PAGINACAO);

		int startItem = currentPage * pageSize;

		if (satelites.size() < startItem) {
			list = Collections.emptyList();
		} else {
			int toIndex = Math.min(startItem + pageSize, satelites.size());
			list = satelites.subList(startItem, toIndex);
		}

		Page<SateliteEntity> satelitePage = new PageImpl<SateliteEntity>(list, PageRequest.of(currentPage, pageSize),
				satelites.size());
		
		return satelitePage;
		
	}
	
}
