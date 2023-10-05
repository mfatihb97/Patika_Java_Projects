package Week_04.Advanture_Game.Adenture_Game;

public class Inventory {

    private Weapons weapon;
    private Armory armor;

    private boolean Food = false;
    private boolean Firewood = false;
    private boolean Water = false;

    public Inventory() {
        this.weapon = new Weapons("Hands", -1, 0, 0);
        this.armor = new Armory(-1, "Basic clothes", 0, 0);
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }

    public Armory getArmory() {
        return armor;
    }

    public void setArmory(Armory armor) {
        this.armor = armor;
    }

    public Armory getArmor() {
        return armor;
    }

    public void setArmor(Armory armor) {
        this.armor = armor;
    }

    public boolean isFood() {
        return Food;
    }

    public void setFood(boolean food) {
        Food = food;
    }

    public boolean isFirewood() {
        return Firewood;
    }

    public void setFirewood(boolean firewood) {
        Firewood = firewood;
    }

    public boolean isWater() {
        return Water;
    }

    public void setWater(boolean water) {
        Water = water;
    }
}
