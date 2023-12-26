package dev.ali.ApiMovies.exceptions.country;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import dev.ali.ApiMovies.exceptions.CountryException;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Country not found")
public class CountryNotFoundException extends CountryException {

    public CountryNotFoundException(String message) {
        super(message);
        
    }

    public CountryNotFoundException(String message, Throwable cause) {
        super(message, cause);
        
    }
    
}
