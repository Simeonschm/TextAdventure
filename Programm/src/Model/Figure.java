package Model;

public abstract class Figure {
    private String Name;
    private int Strength;
    private int Level;

    public Figure(String name, int strength, int level) {
        Name = name;
        Strength = strength;
        Level = level;
    }


    public String getName() {
        return Name;
    }

    public int getStrength() {
        return Strength;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }
}


