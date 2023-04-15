package com.haw.srs.customerservice;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)
@ActiveProfiles(profiles = "testing")
public class MovieRepositoryTest {

    @Autowired
    private MovieRepository movieRepository;


    // Erstelle ein neues Movie-Objekt und speichere es in der Datenbank
    @BeforeEach
    void setUp() {
        Movie movie = new Movie();
        movie.setTitle("Royals");
        this.movieRepository.save(movie);
    }

    // Suche nach dem Film anhand seines Titels
    @Test
    public void getMovieSuccess() {
        Optional<Movie> foundMovie = movieRepository.findByTitle("Royals");

        // Überprüfe, ob der gefundene Film tatsächlich existiert
        assertThat(foundMovie).isPresent();

    }
}
