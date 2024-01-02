package dev.ali.ApiMovies.services;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.ali.ApiMovies.models.Genres;
import dev.ali.ApiMovies.repositories.GenreRepository;

@Service
public class GenreService {
    GenreRepository repository;

    public GenreService(GenreRepository repository) {
        this.repository = repository;
    }

    public List<Genres> getAll() {
        List<Genres> genres = repository.findAll();
        return genres;

    }

}