package Week_04.Advanture_Game;

import java.util.Objects;
import java.util.Random;

public abstract class CombatZone extends Location {
    private Monster monster;
    private String award;
    private int maxMonster;

    public CombatZone(Player player, String name, Monster monster, String award, int maxMonster) {
        super(player, name);
        this.monster = monster;
        this.award = award;
        this.maxMonster = maxMonster;
    }

    @Override
    public boolean onLocation() {
        int monsterNumber = this.randomMonsterCount();
        System.out.println("Current location : " + this.getName());
        System.out.println("Be careful! This zone is dangerous! " + monsterNumber + " number of " + this.getMonster().getName() + " is living here !");
        System.out.print("<F>ight or <R>un");
        String doBattle = input.nextLine();
        doBattle = doBattle.toUpperCase();
        if (doBattle.equals("F")) {
            System.out.println("Combat is about to start!");
            if (combat(monsterNumber)) {
                System.out.println();
                System.out.println(this.getName() + " : You have defeated all the monster inside! Zone reward added to your inventory !");
                System.out.println("You acquired zone special award : " + this.getAward());
                collectAward();
                return true;
            }
        }
        if (this.getPlayer().getStamina() <= 0) {
            System.out.println("You died ! Next time try to not get hunt (-_-)");
            return false;
        }
        return true;
    }

    public void collectAward() {
        if (Objects.equals(this.getAward(), "Food")) {
            this.getPlayer().getInventory().setFood(true);
        }
        if (Objects.equals(this.getAward(), "Firewood")) {
            this.getPlayer().getInventory().setFirewood(true);
        }
        if (Objects.equals(this.getAward(), "Water")) {
            this.getPlayer().getInventory().setWater(true);
        }

    }

    public boolean combat(int monsterNumber) {
        int defaultMonsterStamina = this.getMonster().getStamina();
        Random randomNumber = new Random();
        for (int i = 1; i <= monsterNumber; i++) {
            playerStats();
            monsterStats(i);
            if (randomNumber.nextInt(1, 10) < 6) {
                while (this.getPlayer().getStamina() > 0 && this.getMonster().getStamina() > 0) {
                    System.out.println("<F>ight or <R>un : ");
                    String startCombat = input.nextLine().toUpperCase();
                    if (startCombat.equals("F")) {
                        System.out.println(this.getPlayer().getName() + " attacked to " + this.getMonster().getName());
                        this.getMonster().setStamina(this.monster.getStamina() - this.getPlayer().getTotalDamage());
                        afterHit();
                        if (this.getMonster().getStamina() > 0) {
                            System.out.println();
                            System.out.println("Monster attacked you!");
                            int monsterDDealt = this.getMonster().randomDamage() - this.getPlayer().getInventory().getArmory().getDefence();
                            if (monsterDDealt < 0) {
                                monsterDDealt = 0;
                            }
                            this.getPlayer().setStamina(this.getPlayer().getStamina() - monsterDDealt);
                            afterHit();
                        }

                    } else return false;
                }

            } else {
                while (this.getPlayer().getStamina() > 0 && this.getMonster().getStamina() > 0) {
                    System.out.println("<F>ight or <R>un : ");
                    String startCombat = input.nextLine().toUpperCase();
                    if (startCombat.equals("F")) {
                        if (this.getMonster().getStamina() > 0) {
                            System.out.println("Monster attacked you!");
                            int monsterDDealt = this.getMonster().randomDamage() - this.getPlayer().getInventory().getArmory().getDefence();
                            if (monsterDDealt < 0) {
                                monsterDDealt = 0;
                            }
                            this.getPlayer().setStamina(this.getPlayer().getStamina() - monsterDDealt);
                            afterHit();
                            System.out.println();
                        }
                        System.out.println(this.getPlayer().getName() + " attacked to " + this.getMonster().getName());
                        this.getMonster().setStamina(this.monster.getStamina() - this.getPlayer().getTotalDamage());
                        afterHit();
                    } else return false;

                }

            }


            if (this.getMonster().getStamina() < this.getPlayer().getStamina()) {
                System.out.println();
                System.out.println("You have defeated the " + this.getMonster().getName() + " !");
                this.monster.randomDrop();
                if (this.getMonster().getDropArmor() != null) {
                    this.getPlayer().getInventory().setArmory((this.getMonster().getDropArmor()));
                    System.out.println("Drop item has been added to your inventory ! " + this.getPlayer().getInventory().getArmory().getName());
                }
                if (this.getMonster().getDropWeapon() != null) {
                    this.getPlayer().getInventory().setWeapon((this.getMonster().getDropWeapon()));
                    System.out.println("Drop item has been added to your inventory ! " + this.getPlayer().getInventory().getWeapon().getName());
                }
                System.out.println(this.getMonster().getGoldDrop() + " gold earned.");
                this.getPlayer().setGold(this.getPlayer().getGold() + getMonster().getGoldDrop());
                System.out.println("Current gold : " + this.getPlayer().getGold());
            } else {
                return false;
            }
            this.getMonster().setStamina(defaultMonsterStamina);


        }
        return true;

    }


    public void afterHit() {
        System.out.println("Your remaining stamina : " + this.getPlayer().getStamina());
        System.out.println(this.getMonster().getName() + " remaining stamina : " + this.getMonster().getStamina());
    }

    public void playerStats() {
        System.out.println();
        System.out.println("Character Stats");
        System.out.println("================");
        System.out.println("Stamina : " + this.getPlayer().getStamina());
        System.out.println("Weapon : " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Damage : " + this.getPlayer().getTotalDamage());
        System.out.println("Armor : " + this.getPlayer().getInventory().getArmory().getName());
        System.out.println("Defence : " + this.getPlayer().getInventory().getArmory().getDefence());
        System.out.println("Gold : " + this.getPlayer().getGold());

    }

    public void monsterStats(int i) {
        System.out.println();
        System.out.println(i + ". " + this.getMonster().getName() + " stats");
        System.out.println("==============");
        System.out.println("Stamina : " + this.getMonster().getStamina());
        System.out.println("Damage : " + this.getMonster().getDamage());
        System.out.println("Drop : " + this.getMonster().getGoldDrop());
    }


    public int randomMonsterCount() {
        Random r = new Random();
        return r.nextInt(this.getMaxMonster()) + 1;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxMonster() {
        return maxMonster;
    }

    public void setMaxMonster(int maxMonster) {
        this.maxMonster = maxMonster;
    }
}
