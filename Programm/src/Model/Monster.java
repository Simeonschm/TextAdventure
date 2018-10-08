package Model;

public class Monster extends Figure {



    public Monster(String Name, int Strength, int Level) {
        super(Name, Strength, Level);

    }

    public String[] setMonsterbname() {
        String[] MN = new String[10];
        MN[0] = "Monster1";
        MN[1] = "Monster2";
        MN[2] = "Monster3";
        MN[3] = "Monster4";
        MN[4] = "Monster5";
        MN[5] = "Monster6";
        MN[6] = "Monster7";
        MN[7] = "Monster8";
        MN[8] = "Monster9";
        MN[9] = "Monster10";

        return MN;
    }
}

