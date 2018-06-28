package com.locator.tabajara.repository;


import com.locator.tabajara.model.MovieRentals;

import org.springframework.data.repository.CrudRepository;



public interface MovieRentalsRepository extends CrudRepository<MovieRentals, Long> {
    public Iterable<MovieRentals> findByUserId(Long userId);
}


