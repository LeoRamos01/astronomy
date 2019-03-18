package br.com.lramos.astronomy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lramos.astronomy.entity.PlanetEntity;

/**
 * @author leonardorm
 *
 */
@Repository
public interface PlanetRepository extends JpaRepository<PlanetEntity, Long> {

	/**
	 * @param string
	 * @return {@link PlanetEntity} correspondente à Terra.
	 */
	public PlanetEntity findByName(String string);

}
