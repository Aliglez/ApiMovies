package dev.ali.ApiMovies.services;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.ali.ApiMovies.exceptions.movies.MovieNotFoundException;
import dev.ali.ApiMovies.models.Movies;
import dev.ali.ApiMovies.repositories.MovieRepository;

@Service
public class MovieService {
    MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    public List<Movies> getAll(){
        List<Movies> movies = repository.findAll();
        return movies;

    }

    public Movies getById(Long id) throws Exception {
        Movies movie = repository.findById(id).orElseThrow(() -> new MovieNotFoundException("Movie not found"));
        return movie;
    }

    
}
