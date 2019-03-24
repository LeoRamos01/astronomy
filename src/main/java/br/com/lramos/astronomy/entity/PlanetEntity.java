package br.com.lramos.astronomy.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

/**
 * @author leonardorm
 *
 */
@Data
@Entity(name = "planet")
public class PlanetEntity {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer ordem;

	private String name;

	private String nomeBR;

	private Double mass;

	private Double diameter;

	private Double density;

	private Double gravity;

	@Column(name = "escape_velocity")
	private Double escapeVelocity;

	@Column(name = "rotation_period")
	private Double rotationPeriod;

	@Column(name = "length_of_day")
	private Double lengthDay;

	@Column(name = "distance_from_sun")
	private Double distanceSun;

	private Double perihelion;

	private Double aphelion;

	@Column(name = "orbital_period")
	private Double orbitalPeriod;

	@Column(name = "orbital_velocity")
	private Double orbitalVelocity;

	@Column(name = "orbital_inclination")
	private Double orbitalInclination;

	@Column(name = "orbital_eccentricity")
	private Double orbitalEccentricity;

	@Column(name = "obliquity_to_orbit")
	private Double obliquityOrbit;

	@Column(name = "mean_temperature")
	private Double meanTemperature;

	@Column(name = "surface_pressure")
	private Double surfacePressure;

	@Column(name = "number_of_moons")
	private Integer numberMoons;

	@Column(name = "has_ring_system")
	private Boolean hasRings;

	@Column(name = "has_global_magnetic_field")
	private Boolean hasMagneticField;

	@OneToMany(mappedBy = "planeta", cascade = CascadeType.ALL)
	private Set<SateliteEntity> satelites;

}
