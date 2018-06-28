package com.locator.tabajara.Service;


import com.locator.tabajara.model.MovieRentals;
import com.locator.tabajara.repository.MovieRentalsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


@Service
public class MovieRentalsService {

    @Autowired
    private MovieRentalsRepository movieRentalsRepository;

    @GetMapping
    public List<MovieRentals> getByUser(Long userId) {
        return StreamSupport
                .stream(movieRentalsRepository.findByUserId(userId).spliterator(), false)
                .collect(Collectors.toList());
    }


}
