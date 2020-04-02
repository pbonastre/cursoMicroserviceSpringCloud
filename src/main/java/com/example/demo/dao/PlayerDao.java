package com.example.demo.dao;

import com.example.demo.domain.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RestResource(path = "players",rel = "players")
public interface PlayerDao extends CrudRepository<Player, Long> {

    List<Player> findAll();
    Player findByName(String name);

}
