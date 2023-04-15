package com.haw.srs.customerservice;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor (access = AccessLevel.PUBLIC)
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;



    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "RESERVATION_ID")
    private Reservation reservation;

    @Column
    private String filmname;

    @Column
    private Integer spieldauer;

    public Movie(String filmname) {
        this.filmname = filmname;
    }
}
