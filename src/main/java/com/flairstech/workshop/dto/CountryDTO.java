package com.flairstech.workshop.dto;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.flairstech.workshop.entities.CountryLanguage;

public class CountryDTO {
	private String name;
	private String continent;
	private Integer population;
	private Float lifeExpectancy;
	@JsonIgnore
	private Set<CountryLanguage> languages;

	public void setLanguages(Set<CountryLanguage> languages) {
		this.languages = languages;
	}

	private Set<CountryLanguage> getLanguages() {
		return languages;
	}

	public String getName() {
		return name;
	}

	public String getContinent() {
		return continent;
	}

	public Integer getPopulation() {
		return population;
	}

	public Float getLifeExpectancy() {
		return lifeExpectancy;
	}

	public String getCountryLanguage() {
		return getLanguages().stream().filter(e -> e.getIsOfficial().equals(Boolean.TRUE)).findFirst()
				.orElse(new CountryLanguage()).getLanguage();
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public void setLifeExpectancy(Float lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

}
