package br.com.lramos.astronomy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lramos.astronomy.entity.PlanetEntity;
import br.com.lramos.astronomy.entity.SateliteEntity;

/**
 * @author leonardorm
 *
 */
@Repository
public interface SateliteRepository extends JpaRepository<SateliteEntity, Long>{

	/**
	 * @param id
	 * @return {@link List} de todos os {@link SateliteEntity} que pertençam a um {@link PlanetEntity}.
	 */
	public List<SateliteEntity> findAllByPlaneta(PlanetEntity id);
	
}
