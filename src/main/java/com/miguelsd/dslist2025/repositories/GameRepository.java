package com.miguelsd.dslist2025.repositories;

import com.miguelsd.dslist2025.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
