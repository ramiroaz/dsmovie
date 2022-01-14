package com.zavala.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zavala.dsmovie.entities.Score;
import com.zavala.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
