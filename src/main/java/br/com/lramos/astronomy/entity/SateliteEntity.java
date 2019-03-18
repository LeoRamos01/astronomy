package br.com.lramos.astronomy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

/**
 * @author leonardorm
 *
 */
@Data
@Entity(name = "satellite")
public class SateliteEntity {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "planet_id")
	private PlanetEntity planeta;

	private String name;

	private Double gm;
	
	private Double radius;
	
	private Double density;
	
	private Double magnitude;
	
	private Double albedo;

}
