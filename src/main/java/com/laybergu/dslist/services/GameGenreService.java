package com.laybergu.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.laybergu.dslist.dto.GameGenreDTO;
import com.laybergu.dslist.entities.GameGenre;
import com.laybergu.dslist.repositories.GameGenreRepository;

@Service
public class GameGenreService {

    @Autowired
    private GameGenreRepository gameGenreRepository; 

    @Transactional(readOnly = true)
    public List<GameGenreDTO> findAll() {

        List<GameGenre> result = gameGenreRepository.findAll();

        return result.stream().map(l -> new GameGenreDTO(l)).toList();
    }
}
