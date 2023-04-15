package com.haw.srs.customerservice;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.utility.dispatcher.JavaDispatcher;

import javax.persistence.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="movie_id")
    private Movie movie;

    @Column
    private int platznummer;

    @Column
    private int saalnummer;

    public Reservation(Movie movie) {

        this.movie = movie;
    }
}
