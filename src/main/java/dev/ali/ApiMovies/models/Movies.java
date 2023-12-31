package dev.ali.ApiMovies.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "movies")
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movie")
    private Long id;

    private String title;
    private Integer release_year;
    private String description;
    private short running_time;

    
    @ManyToOne
    @JoinColumn(name = "genre_id", nullable = true)
    private Genres genres;

    /* @JoinTable(
        name = "actors_movies", joinColumns = @JoinColumn( name = "movies_id", nullable = false ), inverseJoinColumns = @JoinColumn(name = "actor_id", nullable = false)
    )
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Actors> actors; */

    public Movies() {
    }

    public Movies(String title, Integer release_year, String description, short running_time) {
        this.title = title;
        this.release_year = release_year;
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

    public Integer getYear() {
        return release_year;
    }

    public void setYear(Integer release_year) {
        this.release_year = release_year;
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
