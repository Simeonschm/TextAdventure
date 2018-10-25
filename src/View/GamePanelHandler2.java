package View;
import Contoller.MainController;

import javax.swing.*;

public class GamePanelHandler2 {
    private JPanel panel2;
    private JLabel name;
    private JEditorPane game;
    private JLabel playerName;
    private JLabel power;
    private JLabel playerPower;
    private JTextField actionText;
    private JLabel action;
    private JLabel MonsterPower;
    private JLabel getloaded;
    private JTextField writeWeitherYouWantTextField;
    private JLabel Level;
    private JLabel getMonsterPower;
    private JLabel princessPower;
    private JLabel monsterName;
    private MainController mainC;


    public GamePanelHandler2(String name, int strength, int level, int monsterPower, MainController mainC){
        this.mainC= mainC;
        playerName.setText(name);
        playerPower.setText(String.valueOf(strength));
        getloaded.setText(String.valueOf(mainC.getPlayerLoaded()));
        monsterName.setText(mainC.getMonsterName());


        getMonsterPower.setText(String.valueOf(monsterPower));



    }

    public JPanel getPanel2(){
        return panel2;
    }



    public void updatePower(){
        playerPower.setText(String.valueOf(mainC.getPlayerVitality()));
        getloaded.setText(String.valueOf(mainC.getPlayerLoaded()));
        getMonsterPower.setText(String.valueOf(mainC.getMonsterVitality()));

    }

    public void handleAction(String answer){
        answer= writeWeitherYouWantTextField.getText();
        mainC.answer(answer);
        updatePower();
    }

}





