package dev.ali.ApiMovies.Controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.ali.ApiMovies.models.Country;
import dev.ali.ApiMovies.services.CountryService;

@RestController
@RequestMapping(path = "${api-endpoint}/countries")
public class CountryController {

    CountryService service;
    private Country newCountry;

    public CountryController(CountryService service) {
        this.service = service;
    }

    @GetMapping(path = "")
    public List<Country> index() {

        List<Country> countries = service.getAll();
        return countries;
    }  

    @GetMapping(path = "/{id}")
        public Country show(@PathVariable("id") Long id) throws Exception {

        Country country = service.getById(id);
        return country;

    }

    @PostMapping(path = "")
    public ResponseEntity<Country> create(@RequestBody Country country){

        Country newCountry = service.save(country);
        return ResponseEntity.status(201).body(newCountry);
    }
}
