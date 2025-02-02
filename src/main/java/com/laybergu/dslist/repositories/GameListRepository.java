package com.laybergu.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laybergu.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}
