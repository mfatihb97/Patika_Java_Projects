package Week_04.Advanture_Game.Adenture_Game;

public class ToolStore extends NeutralZone {
    public ToolStore(Player player) {
        super(player, "ToolShop");
    }

    @Override
    public boolean onLocation() {
        boolean showMenu = true;
        System.out.println("Welcome to ToolStore ! Here you can find anything you need in your journey ! ");
        while (showMenu) {
            System.out.println("1 - Weapons");
            System.out.println("2 - Armors");
            System.out.println("3 - Exit");
            System.out.print("Selection :");
            int selectCase = Location.input.nextInt();
            while (selectCase < 1 || selectCase > 3) {
                System.out.println("Invalid selection , please try again !");
                selectCase = input.nextInt();
            }

            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapons();
                    break;
                case 2:
                    printArmors();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Greetings!");
                    showMenu = false;
                    break;

            }
        }
        return true;
    }

    public void printWeapon() {
        System.out.println("=====Weapons=====");
        System.out.println();
        for (Weapons w : Weapons.weapons()) {
            System.out.println(w.getId() + " - Weapon : " + w.getName() + " , Weapon Damage : " + w.getDamage() + " , Weapon Price : " + w.getPrice());
        }
        System.out.println("0 - Exit ");


    }

    public void buyWeapons() {
        System.out.println("Weapon selection : Please select your weapon with weapon id ! ");
        int selectWeaponID = input.nextInt();
        while (selectWeaponID < 0 || selectWeaponID > Weapons.weapons().length) {
            System.out.println("Invalid selection , please try again !");
            selectWeaponID = input.nextInt();
        }
        if (selectWeaponID != 0) {
            Weapons selectedWeapon = Weapons.getWeaponsObjByID(selectWeaponID);
            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getGold()) {
                    System.out.println("You don't have enough money !");
                } else {
                    System.out.println(selectedWeapon.getName() + " has bought.");
                    int balance = this.getPlayer().getGold() - selectedWeapon.getPrice();
                    this.getPlayer().setGold(balance);
                    System.out.println("Remaining gold : " + this.getPlayer().getGold());
                    System.out.println("Previous weapon : " + this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("New weapon : " + this.getPlayer().getInventory().getWeapon().getName());
                }
            }
        }

    }

    public void printArmors() {
        System.out.println("=====Armors=====");
        System.out.println();
        for (Armory a : Armory.armors()) {
            System.out.println(a.getId() + " - " + "Armor : " + a.getName() + " , Armor Defence : " + a.getDefence() + " , Armor Price : " + a.getPrice());
        }
        System.out.println("0 - Exit ");
    }

    public void buyArmor() {
        System.out.println("Armor selection : Please select your weapon with weapon id ! ");
        int selectArmorID = input.nextInt();
        while (selectArmorID < 0 || selectArmorID > Armory.armors().length) {
            System.out.println("Invalid selection , please try again !");
            selectArmorID = input.nextInt();
        }

        if (selectArmorID != 0) {
            Armory selectedArmor = Armory.getArmorsObjByID(selectArmorID);
            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getGold()) {
                    System.out.println("You don't have enough money !");
                } else {
                    System.out.println(selectedArmor.getName() + " has bought.");
                    int balance = this.getPlayer().getGold() - selectedArmor.getPrice();
                    this.getPlayer().setGold(balance);
                    System.out.println("Remaining gold : " + this.getPlayer().getGold());
                    System.out.println("Previous armor : " + this.getPlayer().getInventory().getArmory().getName());
                    this.getPlayer().getInventory().setArmory(selectedArmor);
                    System.out.println("New armor : " + this.getPlayer().getInventory().getArmory().getName());
                }
            }

        }


    }
}
