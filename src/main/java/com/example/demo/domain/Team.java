package com.example.demo.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;
//instead of json this will show and XML,if you remove it they will show json
@XmlRootElement
@Entity
public class Team {

    @Id @GeneratedValue
    Long id;
    String name;
    String location;
    String mascotte;
    @OneToMany(cascade= CascadeType.ALL) @JoinColumn(name = "teamId")
    Set<Player> players;

    public Team() {
        super();
    }

    public Team(String name, String location, Set<Player> players) {
        this();
        this.name = name;
        this.location = location;
        this.players = players;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMascotte() {
        return mascotte;
    }

    public void setMascotte(String mascotte) {
        this.mascotte = mascotte;
    }


}
