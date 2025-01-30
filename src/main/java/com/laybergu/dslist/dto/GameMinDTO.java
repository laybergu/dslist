package com.laybergu.dslist.dto;

import com.laybergu.dslist.entities.Game;

public class GameMinDTO {
    private Long Id;
    private String Title;
    private Integer Year;
    private String ImgUrl;
    private String ShortDescription;

    public GameMinDTO() {
    }

    public GameMinDTO(Game entity) {
        Id = entity.getId();
        Title = entity.getTitle();
        Year = entity.getYear();
        ImgUrl = entity.getImgUrl();
        ShortDescription = entity.getShortDescription();
    }

    public Long getId() {
        return Id;
    }

    public String getTitle() {
        return Title;
    }

    public Integer getYear() {
        return Year;
    }

    public String getImgUrl() {
        return ImgUrl;
    }

    public String getShortDescription() {
        return ShortDescription;
    }
}