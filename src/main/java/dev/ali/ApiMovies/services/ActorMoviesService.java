/* package dev.ali.ApiMovies.services;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.ali.ApiMovies.models.ActorsMovies;
import dev.ali.ApiMovies.repositories.ActorsMoviesRepository;

@Service
public class ActorMoviesService {

    ActorsMoviesRepository repository;

    public ActorMoviesService(ActorsMoviesRepository repository) {
        this.repository = repository;
    }

    public List<ActorsMovies> getAll() {
        List<ActorsMovies> actors_movies = repository.findAll();
        return actors_movies;
        
    }
    
}
 */