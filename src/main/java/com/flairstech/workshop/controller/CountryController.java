package com.flairstech.workshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.flairstech.workshop.dto.CountryDTO;
import com.flairstech.workshop.services.CountryService;
import com.flairstech.workshop.services.UtilService;

@RestController
public class CountryController {

	@Autowired
	CountryService countryService;
	@Autowired
	UtilService utilService;

	@GetMapping("{code}")
	public CountryDTO findCountryById(@PathVariable String code) {
		return utilService.convertToDTO(countryService.findCountryById(code));

	}

}
