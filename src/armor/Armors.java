package armor;

public class Armors {
    private String coolname;
    private String type;
    private int amorHP;
    private int amorInt;
    private int amorDex;
    private int amorStr;


    public Armors(String coolname, String type, int amorHP, int amorInt, int amorDex, int amorStr) {
        this.coolname = coolname;
        this.type = type;
        this.amorHP = amorHP;
        this.amorInt = amorInt;
        this.amorDex = amorDex;
        this.amorStr = amorStr;
    }

    public String getCoolname() {
        return coolname;
    }

    public void setCoolname(String coolname) {
        this.coolname = coolname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmorHP() {
        return amorHP;
    }

    public void setAmorHP(int amorHP) {
        this.amorHP = amorHP;
    }

    public int getAmorInt() {
        return amorInt;
    }

    public void setAmorInt(int amorInt) {
        this.amorInt = amorInt;
    }

    public int getAmorDex() {
        return amorDex;
    }

    public void setAmorDex(int amorDex) {
        this.amorDex = amorDex;
    }

    public int getAmorStr() {
        return amorStr;
    }

    public void setAmorStr(int amorStr) {
        this.amorStr = amorStr;
    }

}
