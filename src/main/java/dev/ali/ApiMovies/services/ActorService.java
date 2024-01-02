package dev.ali.ApiMovies.services;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.ali.ApiMovies.models.Actors;
import dev.ali.ApiMovies.repositories.ActorRepository;

@Service
public class ActorService {

    ActorRepository repository;

    public ActorService(ActorRepository repository) {
        this.repository = repository;
    }

    public List<Actors> getAll(){
        List<Actors> actors = repository.findAll();
        return actors;

    }
    
}
