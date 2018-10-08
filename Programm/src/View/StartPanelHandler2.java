package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StartPanelHandler2 {
    private JTextField name2;
    private JTextField choosePlayer;
    private JLabel Name;
    private JButton startButton2;
    private MainView2 mainView2;
    private JPanel panel;
    private JLabel choose;
    private JLabel start;

    public StartPanelHandler2(MainView2 mainView) {
        createButtons();
        this.mainView2 = mainView2;

    }

    public JPanel getPanel(){
        return panel;
    }

    private void createButtons(){
        startButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  startButton2pressed();

            }
        });
    }


    private void startButton2pressed(){
        String name = name2.getText();
        String player= choosePlayer.getText();
        mainView2.play(name,player);
    }
}


