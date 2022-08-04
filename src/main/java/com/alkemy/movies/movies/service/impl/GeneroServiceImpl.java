package com.alkemy.movies.movies.service.impl;

import com.alkemy.movies.movies.dto.GeneroDTO;
import com.alkemy.movies.movies.entity.GeneroEntity;
import com.alkemy.movies.movies.mapper.GeneroMapper;
import com.alkemy.movies.movies.repository.GeneroRepository;
import com.alkemy.movies.movies.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroServiceImpl implements GeneroService {
    @Autowired
    private GeneroMapper generoMapper;

    @Autowired
    private GeneroRepository generoRepository;

    public GeneroDTO save(GeneroDTO dto){
        GeneroEntity entity = generoMapper.generoDTO2Entity(dto);
        GeneroEntity entitySaved = generoRepository.save(entity);
        GeneroDTO result = generoMapper.generoEntity2DTO(entitySaved);
        return result;
    }

    public List<GeneroDTO> getAllGeneros() {
        List<GeneroEntity> entities = generoRepository.findAll();
        List<GeneroDTO> result = generoMapper.continenteEntityList2DTOList(entities);
        return result;
    }
}
