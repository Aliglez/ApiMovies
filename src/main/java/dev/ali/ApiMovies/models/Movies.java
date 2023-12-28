package dev.ali.ApiMovies.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movies")
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_movie")
    private Long id;

    private String title;
    private Long year;
    private String description;
    private short running_time;

    public Movies() {
    }

    public Movies(String title, Long year, String description, short running_time) {
        this.title = title;
        this.year = year;
        this.description = description;
        this.running_time = running_time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public short getRunning_time() {
        return running_time;
    }

    public void setRunning_time(short running_time) {
        this.running_time = running_time;
    }

    

    
    
    
}
