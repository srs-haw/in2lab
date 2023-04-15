package com.haw.srs.customerservice;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor (access = AccessLevel.PUBLIC)
public class Reservation {
    public Reservation(Movie movie) {
        this.movie = movie;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;



    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "movie_id")
    private Movie movie;


    @Column
    private int platznummer;

    @Column
    private int saalnummer;

}
