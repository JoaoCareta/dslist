package com.joaocareta.dslist.services;

import com.joaocareta.dslist.dto.GameDto;
import com.joaocareta.dslist.dto.GameMinDto;
import com.joaocareta.dslist.entities.Game;
import com.joaocareta.dslist.projections.GameMinProjection;
import com.joaocareta.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDto> findAll() {
        List<Game> allGamesList = gameRepository.findAll();
        return allGamesList
                .stream()
                .map(GameMinDto::new)
                .toList();
    }

    @Transactional(readOnly = true)
    public GameDto findGameById(Long gameId) {
        Game result = gameRepository.findById(gameId).get();
        return new GameDto(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findGamesByList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result
                .stream()
                .map(GameMinDto::new)
                .toList();
    }
}
