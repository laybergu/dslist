package com.laybergu.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laybergu.dslist.dto.GameGenreDTO;
import com.laybergu.dslist.dto.GameMinDTO;
import com.laybergu.dslist.services.GameGenreService;
import com.laybergu.dslist.services.GameService;

@RestController
@RequestMapping(value = "/genre")
public class GameGenreController {

    @Autowired
    private GameGenreService gameGenreService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameGenreDTO> findAll() {

        return gameGenreService.findAll();
    }

    @GetMapping
    @RequestMapping(value = "/{genreId}/games")
    public List<GameMinDTO> findByGenre(@PathVariable Long genreId) {

        return gameService.findByGenre(genreId);
    }
}
