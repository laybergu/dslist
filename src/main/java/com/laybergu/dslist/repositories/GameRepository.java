package com.laybergu.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laybergu.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
