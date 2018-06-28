package com.locator.tabajara.repository;


import com.locator.tabajara.model.Movie;
import org.springframework.data.repository.CrudRepository;


public interface MovieRepository extends CrudRepository<Movie, Long> {
}


