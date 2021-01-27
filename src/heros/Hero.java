package heros;

public class Hero {

    private String kind;
    private int healt;
    private double strength;
    private int dexterity;
    private int intelligence;
    private int level;

    public Hero(String kind, int hp, double str, int dext, int intg, int level) {
        this.kind = kind;
        this.healt = hp;
        this.strength = str;
        this.dexterity = dext;
        this.intelligence = intg;
        this.level = level;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getHealt() {
        return healt;
    }

    public void setHealt(int healt) {
        this.healt = healt;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getlevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }



}
