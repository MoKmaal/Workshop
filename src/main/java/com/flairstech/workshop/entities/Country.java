package com.flairstech.workshop.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

/**
 * 
 * The Entity class for the country database table.
 * 
 * @author kamal
 * 
 */
@Entity
public class Country implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String code;

	private String code2;

	private String continent;

	private BigDecimal gnp;

	@Column(name = "gnp_old")
	private BigDecimal gnpOld;

	@Column(name = "government_form")
	private String governmentForm;

	@Column(name = "head_of_state")
	private String headOfState;

	@Column(name = "indep_year")
	private Integer indepYear;

	@Column(name = "life_expectancy")
	private Float lifeExpectancy;

	@Column(name = "local_name")
	private String localName;

	private String name;

	private Integer population;

	private String region;

	@Column(name = "surface_area")
	private Float surfaceArea;

	@OneToMany
	@JoinColumn(name = "country_code", referencedColumnName = "code")
	private Set<CountryLanguage> languages;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "capital", referencedColumnName = "id")
	private City capital;
	@OneToMany
	@JoinColumn(name = "country_code", referencedColumnName = "code")
	private Set<City> cities;

	public Set<City> getCities() {
		return cities;
	}

	public String getCode() {
		return code;
	}

	public String getCode2() {
		return code2;
	}

	public String getContinent() {
		return continent;
	}

	public BigDecimal getGnp() {
		return gnp;
	}

	public BigDecimal getGnpOld() {
		return gnpOld;
	}

	public String getGovernmentForm() {
		return governmentForm;
	}

	public String getHeadOfState() {
		return headOfState;
	}

	public Integer getIndepYear() {
		return indepYear;
	}

	public Float getLifeExpectancy() {
		return lifeExpectancy;
	}

	public String getLocalName() {
		return localName;
	}

	public String getName() {
		return name;
	}

	public Integer getPopulation() {
		return population;
	}

	public String getRegion() {
		return region;
	}

	public Float getSurfaceArea() {
		return surfaceArea;
	}

	public Set<CountryLanguage> getLanguages() {
		return languages;
	}

	public City getCapital() {
		return capital;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public void setGnp(BigDecimal gnp) {
		this.gnp = gnp;
	}

	public void setGnpOld(BigDecimal gnpOld) {
		this.gnpOld = gnpOld;
	}

	public void setGovernmentForm(String governmentForm) {
		this.governmentForm = governmentForm;
	}

	public void setHeadOfState(String headOfState) {
		this.headOfState = headOfState;
	}

	public void setIndepYear(Integer indepYear) {
		this.indepYear = indepYear;
	}

	public void setLifeExpectancy(Float lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public void setSurfaceArea(Float surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

	public void setLanguages(Set<CountryLanguage> languages) {
		this.languages = languages;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}

	public void setCities(Set<City> cities) {
		this.cities = cities;
	}
}