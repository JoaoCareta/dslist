package com.joaocareta.dslist.dto;


import com.joaocareta.dslist.entities.Game;

public class GameMinDto {
    private final Long id;
    private final String title;
    private final Integer year;
    private final String imgUrl;
    private final String shortDescription;

    public GameMinDto(Game gameEntity) {
        this.id = gameEntity.getId();
        this.title = gameEntity.getTitle();
        this.year = gameEntity.getYear();
        this.imgUrl = gameEntity.getImgUrl();
        this.shortDescription = gameEntity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
