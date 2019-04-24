package br.com.lramos.astronomy.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author leonardorm
 *
 */
@Entity(name = "planet")
public class PlanetEntity {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
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
	
	@Column(name = "is_dwarf")
	private Boolean isDwarf;

	@JsonIgnore
	@OneToMany(mappedBy = "planeta", cascade = CascadeType.ALL)
	private Set<SateliteEntity> satelites;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNomeBR() {
		return nomeBR;
	}

	public void setNomeBR(String nomeBR) {
		this.nomeBR = nomeBR;
	}

	public Double getMass() {
		return mass;
	}

	public void setMass(Double mass) {
		this.mass = mass;
	}

	public Double getDiameter() {
		return diameter;
	}

	public void setDiameter(Double diameter) {
		this.diameter = diameter;
	}

	public Double getDensity() {
		return density;
	}

	public void setDensity(Double density) {
		this.density = density;
	}

	public Double getGravity() {
		return gravity;
	}

	public void setGravity(Double gravity) {
		this.gravity = gravity;
	}

	public Double getEscapeVelocity() {
		return escapeVelocity;
	}

	public void setEscapeVelocity(Double escapeVelocity) {
		this.escapeVelocity = escapeVelocity;
	}

	public Double getRotationPeriod() {
		return rotationPeriod;
	}

	public void setRotationPeriod(Double rotationPeriod) {
		this.rotationPeriod = rotationPeriod;
	}

	public Double getLengthDay() {
		return lengthDay;
	}

	public void setLengthDay(Double lengthDay) {
		this.lengthDay = lengthDay;
	}

	public Double getDistanceSun() {
		return distanceSun;
	}

	public void setDistanceSun(Double distanceSun) {
		this.distanceSun = distanceSun;
	}

	public Double getPerihelion() {
		return perihelion;
	}

	public void setPerihelion(Double perihelion) {
		this.perihelion = perihelion;
	}

	public Double getAphelion() {
		return aphelion;
	}

	public void setAphelion(Double aphelion) {
		this.aphelion = aphelion;
	}

	public Double getOrbitalPeriod() {
		return orbitalPeriod;
	}

	public void setOrbitalPeriod(Double orbitalPeriod) {
		this.orbitalPeriod = orbitalPeriod;
	}

	public Double getOrbitalVelocity() {
		return orbitalVelocity;
	}

	public void setOrbitalVelocity(Double orbitalVelocity) {
		this.orbitalVelocity = orbitalVelocity;
	}

	public Double getOrbitalInclination() {
		return orbitalInclination;
	}

	public void setOrbitalInclination(Double orbitalInclination) {
		this.orbitalInclination = orbitalInclination;
	}

	public Double getOrbitalEccentricity() {
		return orbitalEccentricity;
	}

	public void setOrbitalEccentricity(Double orbitalEccentricity) {
		this.orbitalEccentricity = orbitalEccentricity;
	}

	public Double getObliquityOrbit() {
		return obliquityOrbit;
	}

	public void setObliquityOrbit(Double obliquityOrbit) {
		this.obliquityOrbit = obliquityOrbit;
	}

	public Double getMeanTemperature() {
		return meanTemperature;
	}

	public void setMeanTemperature(Double meanTemperature) {
		this.meanTemperature = meanTemperature;
	}

	public Double getSurfacePressure() {
		return surfacePressure;
	}

	public void setSurfacePressure(Double surfacePressure) {
		this.surfacePressure = surfacePressure;
	}

	public Integer getNumberMoons() {
		return numberMoons;
	}

	public void setNumberMoons(Integer numberMoons) {
		this.numberMoons = numberMoons;
	}

	public Boolean getHasRings() {
		return hasRings;
	}

	public void setHasRings(Boolean hasRings) {
		this.hasRings = hasRings;
	}

	public Boolean getHasMagneticField() {
		return hasMagneticField;
	}

	public void setHasMagneticField(Boolean hasMagneticField) {
		this.hasMagneticField = hasMagneticField;
	}

	public Set<SateliteEntity> getSatelites() {
		return satelites;
	}

	public void setSatelites(Set<SateliteEntity> satelites) {
		this.satelites = satelites;
	}

	public Boolean getIsDwarf() {
		return isDwarf;
	}

	public void setIsDwarf(Boolean isDwarf) {
		this.isDwarf = isDwarf;
	}

}
