package dev.ali.ApiMovies.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.ali.ApiMovies.models.Country;
import dev.ali.ApiMovies.services.CountryService;

@RestController
@RequestMapping(path = "${api-endpoint}/countries")
public class CountryController {

    CountryService service;

    public CountryController(CountryService service) {
        this.service = service;
    }

    @GetMapping(path = "")
    public List<Country> index() {

        List<Country> countries = service.getAll();
        return countries;
    }  
}
