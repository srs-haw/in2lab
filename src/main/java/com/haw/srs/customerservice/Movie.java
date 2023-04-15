package com.haw.srs.customerservice;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor (access = AccessLevel.PUBLIC)
public class Movie {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn
    private Reservation reservation;

    @Column
    private String title;

    @Column
    private Integer spieldauer;


    public Movie(String titel) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
