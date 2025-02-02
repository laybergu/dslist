package com.laybergu.dslist.dto;

import com.laybergu.dslist.entities.GameGenre;

public class GameGenreDTO {

    private Long id;
    private String name;

    public GameGenreDTO() {
    }

    public GameGenreDTO(GameGenre entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
