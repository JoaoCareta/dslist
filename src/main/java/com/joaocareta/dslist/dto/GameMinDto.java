package com.joaocareta.dslist.dto;


import com.joaocareta.dslist.entities.Game;
import com.joaocareta.dslist.projections.GameMinProjection;

import java.util.Objects;

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

    public GameMinDto(GameMinProjection gameMinProjection) {
        this.id = gameMinProjection.getId();
        this.title = gameMinProjection.getTitle();
        this.year = gameMinProjection.getGameYear();
        this.imgUrl = gameMinProjection.getImgUrl();
        this.shortDescription = gameMinProjection.getShortDescription();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameMinDto that = (GameMinDto) o;
        return id.equals(that.id)
                && title.equals(that.title)
                && year.equals(that.year)
                && imgUrl.equals(that.imgUrl)
                && shortDescription.equals(that.shortDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, year, imgUrl, shortDescription);
    }
}
