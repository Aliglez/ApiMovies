package dev.ali.ApiMovies.services;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.ali.ApiMovies.models.Country;
import dev.ali.ApiMovies.repositories.CountryRepository;

@Service
public class CountryService {

    CountryRepository repository;

    public CountryService(CountryRepository repository) {
        this.repository = repository;
    }


    public List<Country> getAll(){
        List<Country> countries = repository.findAll();
        return countries;

    }
    
}
