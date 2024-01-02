/* package dev.ali.ApiMovies.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.ali.ApiMovies.models.ActorsMovies;
import dev.ali.ApiMovies.services.ActorMoviesService;

@RestController
@RequestMapping(path = "${api-endpoint}/actors_movies")
public class ActorsMoviesController {

    ActorMoviesService service;

    public ActorsMoviesController(ActorMoviesService service) {
        this.service = service;
    }

    @GetMapping(path = "")
    public List<ActorsMovies> index() {
        List<ActorsMovies> actors_movies = service.getAll();
        return actors_movies;
    }

}
 */