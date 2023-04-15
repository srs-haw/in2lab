package com.haw.srs.customerservice;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String filmname;

    @Column
    private Integer spieldauer;

    public Movie (String filmname) {
        this.filmname = filmname;
    }
}
