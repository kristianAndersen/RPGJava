package heros.heroSettings;

public class HeroAttributes {
    private String kind;
    private int healt;
    private double strength;
    private int dexterity;
    private int intelligence;
    

    public HeroAttributes(String kind,int hp, double str, int dext, int intg) {
        this.kind = kind;
        this.healt = hp;
        this.strength = str;
        this.dexterity = dext;
        this.intelligence = intg;
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

}
