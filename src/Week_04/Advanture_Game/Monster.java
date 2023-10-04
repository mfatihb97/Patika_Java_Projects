package Week_04.Advanture_Game;

import java.util.Random;

public abstract class Monster {
    private String name;
    private int id;
    private int damage;
    private int stamina;
    private int goldDrop;
    private Weapons dropWeapon;
    private Armory dropArmor;

    public Monster(String name, int id, int damage, int stamina, int goldDrop) {
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.stamina = stamina;
        this.goldDrop = goldDrop;
    }

    public void randomDrop() {
    }


    public int randomDamage() {
        return this.getDamage();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        if (stamina < 0) {
            stamina = 0;
        }
        this.stamina = stamina;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGoldDrop() {
        return goldDrop;
    }

    public void setGoldDrop(int goldDrop) {
        this.goldDrop = goldDrop;
    }

    public Weapons getDropWeapon() {
        return dropWeapon;
    }

    public void setDropWeapon(Weapons dropWeapon) {
        this.dropWeapon = dropWeapon;
    }

    public Armory getDropArmor() {
        return dropArmor;
    }

    public void setDropArmor(Armory dropArmor) {
        this.dropArmor = dropArmor;
    }
}
