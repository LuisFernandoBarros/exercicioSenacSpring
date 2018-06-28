package com.locator.tabajara.model;

import javax.persistence.*;


@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @SequenceGenerator(name = "movies_id_seq", sequenceName = "movies_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "movies_id_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String title;

    private Integer year;

    public Movie() {
    }

    public Movie(Long id, String title, Integer year) {
        this();
        this.setId(id);
        this.setTitle(title);
        this.setYear(year);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
