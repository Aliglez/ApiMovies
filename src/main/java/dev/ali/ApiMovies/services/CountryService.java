package dev.ali.ApiMovies.services;

import java.util.List;

import dev.ali.ApiMovies.models.Country;
import dev.ali.ApiMovies.repositories.CountryRepository;

public class CountryService {

    CountryRepository repository;

    public CountryService(CountryRepository repository) {
        this.repository = repository;
    }


    public List<Country> getAll(CountryRepository countryRepository){
        List<Country> countries = countryRepository.findAll();
        return countries;

    }
    
}
