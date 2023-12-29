package dev.ali.ApiMovies.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.ali.ApiMovies.models.Movies;
import dev.ali.ApiMovies.services.MovieService;

@RestController
@RequestMapping(path = "${api-endpoint}/movies")
public class MovieController {
    
    MovieService service;
    
    public MovieController(MovieService service) {
        this.service = service;
    }



    @GetMapping(path = "")
    public List<Movies> index() {
        List<Movies> movies = service.getAll();
        return movies;
    }
    

}
