package com.laybergu.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.laybergu.dslist.entities.GameGenre;

public interface GameGenreRepository extends JpaRepository<GameGenre, Long> {

    @Modifying
    @Query(nativeQuery = true, value = """
            UPDATE 
                tb_belonging 
            SET 
                position = :newPosition
            WHERE 
                genre_id = :genreId AND game_id = :gameId
            """)
    void updateBelongingPosition(Long genreId, Long gameId, Integer newPosition);
}
