package com.flairstech.workshop.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * 
 * The Entity class for the country_language database table.
 * 
 * @author kamal
 * 
 */
@Entity
@Table(name = "country_language")
@IdClass(value = CountryLanguage.class)
public class CountryLanguage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "is_official")
	private Boolean isOfficial;

	private float percentage;
	@Id
	@Column(name = "country_code")
	private String countryCode;
	@Id
	private String language;

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public Boolean getIsOfficial() {
		return isOfficial;
	}

	public void setIsOfficial(Boolean isOfficial) {
		this.isOfficial = isOfficial;
	}

	public float getPercentage() {
		return percentage;
	}

}