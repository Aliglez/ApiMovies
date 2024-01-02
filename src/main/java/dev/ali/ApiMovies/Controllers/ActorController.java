package dev.ali.ApiMovies.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.ali.ApiMovies.models.Actors;
import dev.ali.ApiMovies.services.ActorService;

@RestController
@RequestMapping(path = "${api-endpoint}/actors")
public class ActorController {

    ActorService service;

    public ActorController(ActorService service) {
        this.service = service;
    }

    @GetMapping(path = "")
    public List<Actors> index() {
        List<Actors> actors = service.getAll();
        return actors;
    }
}
