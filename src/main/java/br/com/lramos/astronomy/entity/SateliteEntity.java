package br.com.lramos.astronomy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author leonardorm
 *
 */
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
	
	private Double diameter;
	
	private Double density;
	
	private Double magnitude;
	
	private Double albedo;
	
	private Double surfaceGravity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PlanetEntity getPlaneta() {
		return planeta;
	}

	public void setPlaneta(PlanetEntity planeta) {
		this.planeta = planeta;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getGm() {
		return gm;
	}

	public void setGm(Double gm) {
		this.gm = gm;
	}

	public Double getDiameter() {
		return diameter;
	}

	public void setDiameter(Double diameter) {
		this.diameter = diameter;
	}

	public Double getSurfaceGravity() {
		return surfaceGravity;
	}

	public void setSurfaceGravity(Double surfaceGravity) {
		this.surfaceGravity = surfaceGravity;
	}

	public Double getDensity() {
		return density;
	}

	public void setDensity(Double density) {
		this.density = density;
	}

	public Double getMagnitude() {
		return magnitude;
	}

	public void setMagnitude(Double magnitude) {
		this.magnitude = magnitude;
	}

	public Double getAlbedo() {
		return albedo;
	}

	public void setAlbedo(Double albedo) {
		this.albedo = albedo;
	}

}
