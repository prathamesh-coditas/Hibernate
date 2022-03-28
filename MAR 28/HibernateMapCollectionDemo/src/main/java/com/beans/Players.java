package com.beans;

public class Players {
    private int jno;
    private String playerName;

    public Players(int jno, String playerName) {
        this.jno = jno;
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getJno() {
        return jno;
    }

    public void setJno(int jno) {
        this.jno = jno;
    }

    public String getName() {
        return playerName;
    }

    public void setName(String playerName) {
        this.playerName = playerName;
    }
}
