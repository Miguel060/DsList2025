package com.miguelsd.dslist2025.services;

import com.miguelsd.dslist2025.dto.GameMinDTO;
import com.miguelsd.dslist2025.entities.Game;
import com.miguelsd.dslist2025.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
