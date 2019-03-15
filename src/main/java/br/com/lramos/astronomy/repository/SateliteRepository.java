package br.com.lramos.astronomy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lramos.astronomy.entity.SateliteEntity;

/**
 * @author leonardorm
 *
 */
@Repository
public interface SateliteRepository extends JpaRepository<SateliteEntity, Long>{

}
