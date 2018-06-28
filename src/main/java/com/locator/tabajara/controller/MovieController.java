package com.locator.tabajara.controller;


import com.locator.tabajara.Service.MovieService;
import com.locator.tabajara.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<Movie> index() {
        return movieService.getAll();
    }
}
