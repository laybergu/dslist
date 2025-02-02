package com.laybergu.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laybergu.dslist.entities.GameGenre;

public interface GameGenreRepository extends JpaRepository<GameGenre, Long> {
    
}
