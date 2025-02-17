package com.joaocareta.dslist.controllers;


import com.joaocareta.dslist.dto.GameDto;
import com.joaocareta.dslist.dto.GameMinDto;
import com.joaocareta.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDto> findAll() {
        return gameService.findAll();
    }

    @GetMapping(value = "/{gameId}")
    public GameDto findGameById(@PathVariable Long gameId) {
        return gameService.findGameById(gameId);
    }

}
