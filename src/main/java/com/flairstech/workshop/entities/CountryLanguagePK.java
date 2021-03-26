package com.flairstech.workshop.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * 
 * The primary key class for the country_language database table.
 * 
 * @author kamal
 * 
 */
public class CountryLanguagePK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "country_code")
	private String countryCode;
	private String language;

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public String getLanguage() {
		return language;
	}

}