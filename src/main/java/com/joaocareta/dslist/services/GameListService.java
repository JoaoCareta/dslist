package com.joaocareta.dslist.services;

import com.joaocareta.dslist.dto.GameListDto;
import com.joaocareta.dslist.entities.GameList;
import com.joaocareta.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDto> findAll() {
        List<GameList> allGameList = gameListRepository.findAll();
        return allGameList
                .stream()
                .map(GameListDto::new)
                .toList();
    }
}
