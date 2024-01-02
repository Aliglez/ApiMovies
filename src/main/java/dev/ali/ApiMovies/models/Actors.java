package dev.ali.ApiMovies.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "actors")
public class Actors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_actor")
    private Long id;

    private String actor_name;

   /*  @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
        name= "actors_movies", joinColumns = {@JoinColumn(name = "id_actor")}, inverseJoinColumns = {@JoinColumn(name = "id_movies")}
    )
    Set<Movies> movies = new HashSet<>(); */


    public Actors() {
    }

    public Actors(Long id, String actor_name) {
        this.id = id;
        this.actor_name = actor_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActor_name() {
        return actor_name;
    }

    public void setActor_name(String actor_name) {
        this.actor_name = actor_name;
    }

    
}
