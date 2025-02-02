package com.laybergu.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.laybergu.dslist.dto.GameGenreDTO;
import com.laybergu.dslist.entities.GameGenre;
import com.laybergu.dslist.projections.GameMinProjection;
import com.laybergu.dslist.repositories.GameGenreRepository;
import com.laybergu.dslist.repositories.GameRepository;

@Service
public class GameGenreService {

    @Autowired
    private GameGenreRepository gameGenreRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameGenreDTO> findAll() {

        List<GameGenre> result = gameGenreRepository.findAll();

        return result.stream().map(l -> new GameGenreDTO(l)).toList();
    }

    @Transactional
    public void changePosition(Long genreId, int sourceIndex, int destinationIndex) {

        List<GameMinProjection> list = gameRepository.searchByGenre(genreId);

        GameMinProjection obj = list.remove(sourceIndex);

        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;

        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for (int i = min; i <= max; i++) {
            gameGenreRepository.updateBelongingPosition(genreId, list.get(i).getId(), i);
        }
    }

}
