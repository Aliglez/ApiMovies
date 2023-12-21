package dev.ali.ApiMovies.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "${api-endpoint}/countries")
public class CountryController {
    @GetMapping(path = "")
    public String index() {
        return "All countries";
    }  
}
