package dev.ali.ApiMovies.Controllers;

import java.util.List;
import dev.ali.ApiMovies.models.Movies;
import dev.ali.ApiMovies.services.MovieService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



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

    @GetMapping(path = "/{id}")
    public ResponseEntity<Movies> show(@PathVariable("id") Long id) throws Exception {
        Movies movies = service.getById(id);
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(movies);
    }
    

}
