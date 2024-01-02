package dev.ali.ApiMovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.ali.ApiMovies.models.Actors;

public interface ActorRepository extends JpaRepository<Actors, Long>{
    
}
