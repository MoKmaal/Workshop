package com.flairstech.workshop.services;

import com.flairstech.workshop.dto.CountryDTO;
import com.flairstech.workshop.entities.Country;

public interface UtilService {
	public CountryDTO convertToDTO(Country country);
}
