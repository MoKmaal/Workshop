package com.flairstech.workshop.services;

import com.flairstech.workshop.entities.Country;

public interface CountryService {
	public Country findCountryById(String code);
}
