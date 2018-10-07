import Contoller.MainController;

import javax.swing.*;

public class MainView1 extends JFrame {

    private MainController maincontroller;
    private JPanel startPanel, gamePanel;


    public MainView1(MainController mainController) {

        this.mainController = mainController;
        this.startPanel = new StartPanelHandler2(this).getPanel();

        this.getContentPane().add(startPanel);

        this.setLocation(50,50);
        this.setSize(1000,750);
        this.setResizable(false);
        this.setTitle("Adventure");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void play(String name, String player){
        mainController.createPlayer(name,player);

        this.getContentPane().removeAll();
        this.getContentPane().invalidate();

        this.gamePanel = new GamePanelHandler(mainController.getPlayerName(),mainController.getPlayerLevel(),mainController).getPanel();
        this.getContentPane().add(gamePanel);
        this.getContentPane().revalidate();

    }
}