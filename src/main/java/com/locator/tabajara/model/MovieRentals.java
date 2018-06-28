package com.locator.tabajara.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Calendar;


public class MovieRentals {

    @Id
    @SequenceGenerator(name = "credit_cards_id_seq", sequenceName = "credit_cards_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "credit_cards_id_seq", strategy = GenerationType.SEQUENCE)
    private Long id;
    private Calendar date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false, updatable = false)
    @JsonIgnore
    private User user;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false, updatable = false)
    @JsonIgnore
    private Movie movie;



}
