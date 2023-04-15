package com.haw.srs.customerservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)
@ActiveProfiles(profiles = "testing")
public class ReservationRepositoryTest {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private MovieRepository movieRepository;

    Movie movie;
    Reservation reservation;

    @BeforeEach
    void setUp() {
        // Erstelle ein neues Movie-Objekt und speichere es in der Datenbank
        Movie movie = new Movie();
        movie.setTitle("Royals");
        this.movie =movie;
        this.movieRepository.save(movie);

        // Erstelle eine neue Reservierung für den Film und speichere sie in der Datenbank
        Reservation reservation = new Reservation();
        reservation.setMovie(movie);
        this.reservation = reservation;
        this.reservationRepository.save(reservation);
    }

    @Test
    public void getReservationSuccess() {
        // Suche nach Reservierungen für den Film
        List <Reservation> reservations = reservationRepository.findByMovie(movie);

        // Überprüfe, ob die gefundene Reservierung der gespeicherten Reservierung entspricht
        assertEquals(1, reservations.size());
        assertEquals(reservation.getId(), reservations.get(0).getId());
    }
}
