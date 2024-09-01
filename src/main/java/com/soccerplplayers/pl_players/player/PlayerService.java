package com.soccerplplayers.pl_players.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class PlayerService {
    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayers(){
        return playerRepository.findAll();
    }

    public List<Player> getPlayersFromTeam(String teamName){
        return playerRepository.findAll().stream()
                .filter(player->teamName.equals(player.getTeam()))
                .collect(Collectors.toList());
    }

    public List<Player> getPLayersByName(String searchText){
        return playerRepository.findAll().stream()
                .filter(player->player.getName().toLowerCase().contains(searchText.toLowerCase()))
                .collect(Collectors.toList());
    }

//
//
//    public List<Player> getPlayersByTeamAndPosition(String team,String position){
//        return playerRepository.findAll().stream()
//                .filter(player->team.equals(player.getTeam()) && position.equals(player.getPosition()))
//                .collect(Collectors.toList());
//    }

    public Player addPlayer(Player player){
        playerRepository.save(player);
        return player;

    }

    public Player updatePlayer(Player updatedPlayer){
        Optional<Player> existingPlayer=playerRepository.findByName(updatedPlayer.getName());
        if(existingPlayer.isPresent()){
            Player playerToUpdate = existingPlayer.get();
            playerToUpdate.setName(updatedPlayer.getName());
            playerRepository.save(playerToUpdate);
            return playerToUpdate;
        }
        return null;
    }

    public void deletePlayer(String playerName){
        playerRepository.deleteByName(playerName);
    }
}
