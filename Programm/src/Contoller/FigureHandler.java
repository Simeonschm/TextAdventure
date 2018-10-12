package Contoller;

import Model.Monster;
import Model.Player;

public class FigureHandler {

    private Player player;
    private Monster monster;

    public FigureHandler(Player player, Monster monster){
        this.player = player;
        this.monster = monster;
    }

    private void handleAction(int action){
        int monsterAction = (int)(Math.random() * 3 + 1);
        if (action == 1){
            if (monsterAction == 2) {
                player.setVitality(player.getVitality() - 1);
            }
        }else if (action == 2){
            if (monsterAction == 1){
                monster.setVitality(monster.getVitality() - 1);
            }
            if (monsterAction == 2){
                player.setVitality(player.getVitality() - 1);
                monster.setVitality(monster.getVitality() - 1);
            }
        }else if (action == 3){

        }
    }
}
