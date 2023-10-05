package Week_04.Advanture_Game.Adenture_Game;

public class Armory {
    private int id;
    private String name;
    private int defence;
    private int price;

    public Armory(int id, String name, int defence, int price) {
        this.id = id;
        this.name = name;
        this.defence = defence;
        this.price = price;
    }

    public static Armory getArmorsObjByID(int id) {
        for (Armory a : Armory.armors()) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    public static Armory[] armors() {
        Armory[] armorList = new Armory[3];
        armorList[0] = new Armory(1, "Cloth Armor", 1, 15);
        armorList[1] = new Armory(2, "Leather Armor", 3, 25);
        armorList[2] = new Armory(3, "Heavy Armor", 5, 40);
        return armorList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
