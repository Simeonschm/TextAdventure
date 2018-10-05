package View;

import Contoller.MainController;

import javax.swing.*;

public class MainView1 extends JFrame {

    private MainController maincontroller;
    private JPanel startPanel, gamePanel;


    public MainView1(MainController mainController) {

        this.mainController = mainController;
        this.startPanel = new StartPanelHandler1(this).getPanel();

        this.getContentPane().add(startPanel);

        this.setLocation(50,50);
        this.setSize(1000,750);
        this.setResizable(false);
        this.setTitle("QAdventureeeee");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void play(String name){
        mainController.createPlayer(name);

        this.getContentPane().removeAll();
        this.getContentPane().invalidate();

        this.gamePanel = new GamePanelHandler(mainController.getPlayerName(),mainController.getPlayerLevel(),mainController).getPanel();
        this.getContentPane().add(gamePanel);
        this.getContentPane().revalidate();

    }
}
