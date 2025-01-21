package com.joaocareta.dslist.dto;

import com.joaocareta.dslist.entities.GameList;
import org.springframework.beans.BeanUtils;

public class GameListDto {
    private Long id;
    private String name;

    public GameListDto(){}

    public GameListDto(GameList gameList) {
        BeanUtils.copyProperties(gameList, this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
