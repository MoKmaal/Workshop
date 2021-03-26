package com.flairstech.workshop.services;

import org.springframework.stereotype.Service;

import com.flairstech.workshop.dto.CountryDTO;
import com.flairstech.workshop.entities.Country;

@Service
public class UtilServiceImpl implements UtilService {
	public CountryDTO convertToDTO(Country country) {
		CountryDTO countryDTO = new CountryDTO();

		countryDTO.setContinent(country.getContinent());
		countryDTO.setLanguages(country.getLanguages());
		countryDTO.setLifeExpectancy(country.getLifeExpectancy());
		countryDTO.setName(country.getName());
		countryDTO.setPopulation(country.getPopulation());
		return countryDTO;
	}
}
