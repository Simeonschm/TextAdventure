package View;
import javax.swing.*;



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JLabel getMonsterPower;
    private JTextField writeWeitherYouWantTextField;
    private JLabel level;


    public GamePanelHandler2( String name, int strength, int level){
        playerName.setText(name);
        playerPower.setText(String.valueOf(strength));
        playerPower.setText(String.valueOf(level));



    }

    public JPanel getPanel2(){
        return panel2;
    }



    public void updatePower(){



    }

    public void handleAction(String answer){
        answer= writeWeitherYouWantTextField.getText();

    }

}





