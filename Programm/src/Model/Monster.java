package Model;

public class Monster extends Figure {



    public Monster(String Name, int Strength, int Level) {
        super(Name, Strength, Level);

    }

    public String[] setMonsterbname() {
        String[] MN = new String[10];
        MN[0] = "Poisongolem";
        MN[1] = "Dead Dweller";
        MN[2] = "Abyssbody";
        MN[3] = "Greedy Howler";
        MN[4] = "Thornwings";
        MN[5] = "Moldling";
        MN[6] = "Smogscream";
        MN[7] = "White-Eyed Gollum";
        MN[8] = "Shadow Thing";
        MN[9] = "Ripper";

        return MN;
    }
}

