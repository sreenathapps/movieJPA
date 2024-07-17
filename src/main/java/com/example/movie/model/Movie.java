/*
 * You can use the following import statements
 * 
 * import javax.persistence.*;
 * 
 */

// Write your code here
package com.example.movie.model;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Movie
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "movielist")
public class Movie {
    @Id
    @Column(name = "movieid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieId;
    @Column(name = "moviename")
    private String movieName;
    @Column(name = "leadactor")
    private String leadActor;
    
}