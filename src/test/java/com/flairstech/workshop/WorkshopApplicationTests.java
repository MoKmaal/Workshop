package com.flairstech.workshop;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import javax.persistence.EntityNotFoundException;

import com.flairstech.workshop.controller.CountryController;
import com.flairstech.workshop.entities.Country;
import com.flairstech.workshop.services.CountryService;

import static org.mockito.BDDMockito.given;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(MockitoJUnitRunner.class)
public class WorkshopApplicationTests {
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();

	@InjectMocks
	private CountryController controller;
	@Mock
	private CountryService countryService;
	private MockMvc mockMvc;

	@Test
	public void findCountryByIdInvalidIdTest() throws Exception {
		String code = "BHR";
		Country c = new Country();
		c.setName("Bahrain");
		c.setContinent("Asia");
		c.setPopulation(617000);
		c.setLifeExpectancy(73f);
		c.setCode(code);

		given(countryService.findCountryById("S")).willReturn(c);
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
		exceptionRule.expect(EntityNotFoundException.class);
		mockMvc.perform(get("/BAH")).andExpect(status().isInternalServerError());

	}

}
