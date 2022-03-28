package com.beans;

import java.util.Map;

public class IplTeamDetails {
    private int id;
    private String name;
    private Map<String, Players> players;

    public IplTeamDetails(int id, String name, Map<String, Players> players) {
        this.id = id;
        this.name = name;
        this.players = players;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Players> getPlayers() {
        return players;
    }

    public void setPlayers(Map<String, Players> players) {
        this.players = players;
    }

}
