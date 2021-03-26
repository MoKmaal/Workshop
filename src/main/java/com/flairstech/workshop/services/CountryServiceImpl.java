package com.flairstech.workshop.services;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flairstech.workshop.entities.Country;
import com.flairstech.workshop.repositories.CountryRepo;

@Service
public class CountryServiceImpl implements CountryService {
	@Autowired
	CountryRepo countryRepo;

	@Override
	public Country findCountryById(String code) {
		return countryRepo.findById(code).orElseThrow(() -> new EntityNotFoundException("INVALID_COUNTRY_CODE"));
	}

}
