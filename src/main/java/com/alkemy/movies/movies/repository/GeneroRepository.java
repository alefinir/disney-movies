package com.alkemy.movies.movies.repository;

import com.alkemy.movies.movies.entity.GeneroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface GeneroRepository extends JpaRepository<GeneroEntity, Long> {

}

