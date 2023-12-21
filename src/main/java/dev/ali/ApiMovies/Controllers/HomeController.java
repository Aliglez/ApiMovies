package dev.ali.ApiMovies.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
    @GetMapping(path = "/")
    public String index(){
        return "hello Spring boot";
    }
    
}