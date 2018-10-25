package Model;

public class Monster extends Figure {
    private boolean loaded;

    public Monster(String Name, int Strength, int Level) {
        super(Name, Strength, Level);
        loaded = false;

    }

    public String setMonstername() {
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

        int index = (int) (Math.random() * 9);
        return MN[index];
    }

    public String randomAction() {
        int randomAction = (int) (Math.random() * 1);
        if (loaded == false) {
            if (randomAction == 1) {
                loaded = true;
                return new String("reload");

            }
            if (randomAction == 0) {
                return new String("hide");

            }
        } else {
            if (randomAction == 1) {
                return new String("hide");
            }
            if (randomAction == 0) {
                loaded=false;
                return new String("shoot");


            }


        }
        return new String ("action fehlgeschlagen");
    }
}

