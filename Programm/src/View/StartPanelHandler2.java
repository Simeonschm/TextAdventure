package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StartPanelHandler2 {
    private JTextField name;
    private JTextField choosePlayer;
    private JLabel Name;
    private JButton startButton2;
    private MainView1 mainView;
    private JPanel panel;
    private JLabel choose;
    private JLabel start;

    public StartPanelHandler1(MainView1 mainView) {
        createButtons();
        this.mainView = mainView;

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
        String name = name.getText();
        String player= choosePlayer.getText();
        mainView.play(name,chooseplayer);
    }
}

}
