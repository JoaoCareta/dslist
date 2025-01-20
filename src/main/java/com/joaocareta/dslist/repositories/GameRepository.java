package com.joaocareta.dslist.repositories;

import com.joaocareta.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
