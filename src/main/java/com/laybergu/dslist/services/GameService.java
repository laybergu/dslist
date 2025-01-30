package com.laybergu.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laybergu.dslist.dto.GameMinDTO;
import com.laybergu.dslist.entities.Game;
import com.laybergu.dslist.repositories.GameRepository;

@Service
public class GameService {
    
    @Autowired  
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {

        List<Game> result = gameRepository.findAll();

        return result.stream().map(g -> new GameMinDTO(g)).toList();
    }
}
