package com.flairstech.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flairstech.workshop.entities.Country;

@Repository
public interface CountryRepo extends JpaRepository<Country, String> {
}