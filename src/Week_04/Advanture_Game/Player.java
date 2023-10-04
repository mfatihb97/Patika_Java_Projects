package Week_04.Advanture_Game;

import java.util.Scanner;

public class Player {

    private int damage;
    private int stamina;
    private int gold;
    private String name;
    private String charClass;
    private int baseStamina;

    private Scanner input = new Scanner(System.in);

    private Inventory inventory;

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectClass() {

        Classes[] classList = {new Ninja(), new Archer(), new Knight()};

        System.out.println("============================================================================");
        for (Classes gameClasses : classList) {
            System.out.println("ID : " + gameClasses.getClassID() +
                    "\t\tClass : " + gameClasses.getCharClass() +
                    "\t\t Damage : " + gameClasses.getDamage() +
                    "\t\t Stamina : " + gameClasses.getStamina() +
                    "\t\t Gold : " + gameClasses.getGold());
        }
        System.out.println("============================================================================");

        System.out.println("Select one of the classes and jump into adventure! ");
        System.out.print("Make your selection with class ID : ");
        int selectClass = input.nextInt();
        switch (selectClass) {
            case 1 -> initPlayer(new Ninja());
            case 2 -> initPlayer(new Archer());
            case 3 -> initPlayer(new Knight());
        }
        System.out.println("Class : " + this.getCharClass() + " ,Damage : "
                + this.getDamage() + " ,Stamina : "
                + this.getStamina() + " ,Gold : "
                + this.getGold());

    }


    public void initPlayer(Classes gameClasses) {
        this.setCharClass(gameClasses.getCharClass());
        this.setDamage(gameClasses.getDamage());
        this.setBaseStamina(gameClasses.getStamina());
        this.setStamina(gameClasses.getStamina());
        this.setGold(gameClasses.getGold());
    }

    public void printInfo() {
        System.out.println("Current weapon : " + this.getInventory().getWeapon().getName() +
                " , Current armor : " + this.getInventory().getArmory().getName() +
                " , Defence : " + this.getInventory().getArmory().getDefence() +
                " , Damage : " + this.getTotalDamage() +
                " , Stamina : " + this.getStamina() +
                " , Gold : " + this.getGold());
    }

    public String getCharClass() {
        return charClass;
    }

    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }

    public int getTotalDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
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

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void selectChar() {
        return;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getBaseStamina() {
        return baseStamina;
    }

    public void setBaseStamina(int baseStamina) {
        this.baseStamina = baseStamina;
    }
}
