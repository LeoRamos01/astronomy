package br.com.lramos.astronomy.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lramos.astronomy.entity.PlanetEntity;
import br.com.lramos.astronomy.repository.PlanetRepository;

/**
 * @author leonardorm
 *
 */
@Service
public class PlanetaBusiness {

	@Autowired
	private PlanetRepository planetRepo;

	/**
	 * @return {@link List} de todos os {@link PlanetEntity}.
	 */
	public List<PlanetEntity> listaTodos() {
		return planetRepo.findAll();
	}

	/**
	 * 
	 * Busca planetas.
	 * 
	 * @return
	 */
	public List<PlanetEntity> listaTodosPlanetas() {
		return planetRepo.findAllByIsDwarfFalse();
	}

	/**
	 * 
	 * Busca planetas anões.
	 * 
	 * @return
	 */
	public List<PlanetEntity> listaTodosPlanetasAnoes() {
		return planetRepo.findAllByIsDwarfTrue();
	}

	/**
	 * @return {@link PlanetEntity} que representa a Terra, para ter seus valores
	 *         utilizados como comparativos.
	 */
	public PlanetEntity getTerra() {
		return planetRepo.findByName("Earth");
	}

}
