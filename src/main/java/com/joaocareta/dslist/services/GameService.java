package com.joaocareta.dslist.services;

import com.joaocareta.dslist.dto.GameMinDto;
import com.joaocareta.dslist.entities.Game;
import com.joaocareta.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> findAll() {
        List<Game> allGamesList = gameRepository.findAll();
        return allGamesList
                .stream()
                .map(GameMinDto::new)
                .toList();
    }
}
