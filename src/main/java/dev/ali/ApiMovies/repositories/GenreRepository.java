package dev.ali.ApiMovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.ali.ApiMovies.models.Genres;

public interface GenreRepository extends JpaRepository<Genres, Long> {
    
}
