package com.haw.srs.customerservice;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;

    private String lastName;

    //einkommentieren, wum Abbildung in DB als String zu konfigurieren, anstelle von Integer
    //@Enumerated(EnumType.STRING)
    private Gender gender;

    private String email;

    private PhoneNumber phoneNumber;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    //@JoinColumn(name="customerId") // generiert dann keine Jointabelle
    @Setter(AccessLevel.NONE)
    private List<Reservation> reservations = new ArrayList<>();

    public Customer(String firstName, String lastName, Gender gender, String email, PhoneNumber phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Customer(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = null;
        this.phoneNumber = null;
    }

    public void addReservation(Reservation reservation) {
        this.reservations.add(reservation);
    }
}
