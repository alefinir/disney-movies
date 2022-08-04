package com.alkemy.movies.movies.controller;

import com.alkemy.movies.movies.dto.GeneroDTO;
import com.alkemy.movies.movies.service.GeneroService;
import com.alkemy.movies.movies.service.impl.GeneroServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("generos")
public class GeneroController {
    @Autowired
    private GeneroService generoService;

    @GetMapping
    public ResponseEntity<List<GeneroDTO>> getAll(){
        List<GeneroDTO> generos = generoService.getAllGeneros();
        return  ResponseEntity.ok().body(generos);
    }

    @PostMapping
    public ResponseEntity<GeneroDTO> save(@RequestBody GeneroDTO genero){
        GeneroDTO generoGuardado = generoService.save(genero);
        return
                ResponseEntity.status(HttpStatus.CREATED).body(generoGuardado);
    }
}
