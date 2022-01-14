package com.zavala.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zavala.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
