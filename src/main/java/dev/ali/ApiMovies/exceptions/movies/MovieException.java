package dev.ali.ApiMovies.exceptions.movies;

public class MovieException extends RuntimeException {

    public MovieException(String message) {
        super(message);
    }

    public MovieException( String message, Throwable cause) {
        super(message, cause);
    }
    
}
