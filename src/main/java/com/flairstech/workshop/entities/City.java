package com.flairstech.workshop.entities;

import javax.persistence.*;

/**
 * 
 * The Entity class for the city database table
 * 
 * @author kamal
 */
@Entity
public class City {

	@Id
	private Integer id;

	private String district;

	private String name;

	private Integer population;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPopulation() {
		return this.population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

}