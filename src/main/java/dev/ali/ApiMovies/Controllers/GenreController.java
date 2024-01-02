package dev.ali.ApiMovies.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.ali.ApiMovies.models.Genres;
import dev.ali.ApiMovies.services.GenreService;

@RestController
@RequestMapping(path = "${api-endpoint}/genres")
public class GenreController {

    GenreService service;

        public GenreController(GenreService service) {
        this.service = service;
    }


    @GetMapping(path = "")
    public List<Genres> index() {
        List<Genres> genres = service.getAll();
        return genres;
    }

}
