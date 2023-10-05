package Week_04.Advanture_Game.Adenture_Game;

public abstract class Classes {

    private int classID;
    private String charClass;
    private int damage;
    private int stamina;
    private int gold;

    public Classes(int classID, String charClass, int damage, int stamina, int gold) {
        this.classID = classID;
        this.charClass = charClass;
        this.damage = damage;
        this.stamina = stamina;
        this.gold = gold;
    }

    public String getCharClass() {
        return charClass;
    }

    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
