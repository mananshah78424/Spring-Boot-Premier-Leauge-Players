package com.soccerplplayers.pl_players.player;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="player_stats")
public class Player {
    @Id
    @Column(name="name", unique = true)
    private String name;
    private String team;
    private Integer games_played;
    private Integer games_started;
    private Integer minutes_played;
    private Integer goals_scored;
    private Integer assists;
    private Integer shots_taken;
    private Integer shots_on_goal;


    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Integer getGames_played() {
        return games_played;
    }

    public void setGames_played(Integer games_played) {
        this.games_played = games_played;
    }

    public Integer getGames_started() {
        return games_started;
    }

    public void setGames_started(Integer games_started) {
        this.games_started = games_started;
    }

    public Integer getMinutes_played() {
        return minutes_played;
    }

    public void setMinutes_played(Integer minutes_played) {
        this.minutes_played = minutes_played;
    }

    public Integer getGoals_scored() {
        return goals_scored;
    }

    public void setGoals_scored(Integer goals_scored) {
        this.goals_scored = goals_scored;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Integer getShots_taken() {
        return shots_taken;
    }

    public void setShots_taken(Integer shots_taken) {
        this.shots_taken = shots_taken;
    }

    public Integer getShots_on_goal() {
        return shots_on_goal;
    }

    public void setShots_on_goal(Integer shots_on_goal) {
        this.shots_on_goal = shots_on_goal;
    }
}
