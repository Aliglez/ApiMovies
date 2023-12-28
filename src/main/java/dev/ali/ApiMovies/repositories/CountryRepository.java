package dev.ali.ApiMovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.ali.ApiMovies.models.Country;

public interface CountryRepository extends JpaRepository<Country,Long> {

    public Country findByName(String name);

    
}
