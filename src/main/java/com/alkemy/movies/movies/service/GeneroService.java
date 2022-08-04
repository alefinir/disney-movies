package com.alkemy.movies.movies.service;

import com.alkemy.movies.movies.dto.GeneroDTO;

import java.util.List;

public interface GeneroService {
    GeneroDTO save(GeneroDTO dto);
    List<GeneroDTO> getAllGeneros();
}
