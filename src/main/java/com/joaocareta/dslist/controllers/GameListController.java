package com.joaocareta.dslist.controllers;

import com.joaocareta.dslist.dto.GameListDto;
import com.joaocareta.dslist.dto.GameMinDto;
import com.joaocareta.dslist.services.GameListService;
import com.joaocareta.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    GameService gameService;

    @GetMapping
    public List<GameListDto> findAll() {
        return gameListService.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDto> findGamesByList(@PathVariable Long listId) {
        return gameService.findGamesByList(listId);
    }
}
