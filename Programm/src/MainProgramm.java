import Contoller.MainController;
import View.MainView1;
import View.MainView2;

public class MainProgramm {

    public static void main(String[] args) {
        MainView1 mainView1 = new MainView1(new MainController());
        MainView2 mainView2 = new MainView2(new MainController());
    }
}
