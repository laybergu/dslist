package com.laybergu.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.laybergu.dslist.dto.GameListDTO;
import com.laybergu.dslist.entities.GameList;
import com.laybergu.dslist.repositories.GameListRepository;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository; 

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {

        List<GameList> result = gameListRepository.findAll();

        return result.stream().map(l -> new GameListDTO(l)).toList();
    }
}
