package Week_04.Advanture_Game.Adenture_Game;

import java.util.Scanner;

public class Game {

    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Welcome the Adventure Game ! ");
        System.out.println("Nickname : ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("Dear " + player.getName() + " welcome to this world !");
        System.out.println("Select your class to get into this new dimension ! ");
        player.selectClass();

        while (true) {
            player.printInfo();
            Location location = null;
            System.out.println();
            System.out.println("======Locations======");
            System.out.println("1-Safe House - Safe place , there is no foes and you can heal up in here.");
            System.out.println("2-Tool Store - A store where you can find useful tools.");
            System.out.println("3-Cave - Be careful, this place is full of danger! Low level foes. Award : Food");
            System.out.println("4-Forest - Be careful, this place is even more dangerous! Medium level foes. Award : Firewood");
            System.out.println("5-River - If you're smart turn around and run! High level foes. Award : Water");
            System.out.println("6-Mines - Lucky zone.You can drop items here but not gold!");
            System.out.println("0-Exit - Close the game.");
            System.out.println("Please select location to go :");
            int selectLoc = input.nextInt();
            switch (selectLoc) {
                case 0:
                    break;
                case 1:
                    location = new SafeHouse(player);
                    if (player.getInventory().isFood() && player.getInventory().isFirewood() && player.getInventory().isWater()) {
                        System.out.println("Congratulations! You have collected all the special awards and turned back home safely! ");
                        System.out.println("Game is completed !! (-_-) ");
                        break;
                    }
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    if (player.getInventory().isFood()) {
                        System.out.println("You have already acquired zone special award! \n Food");
                        continue;
                    }
                    location = new Cave(player);
                    break;
                case 4:
                    if (player.getInventory().isFirewood()) {
                        System.out.println("You have already acquired zone special award! \n Firewood");
                        continue;
                    }
                    location = new Forest(player);
                    break;
                case 5:
                    if (player.getInventory().isWater()) {
                        System.out.println("You have already acquired zone special award! \n Water ");
                        continue;
                    }
                    location = new River(player);
                    break;
                case 6:
                    location = new Mines(player);
                    break;
                default:
                    System.out.println("Please select valid location!");
            }
            if (location == null) {
                System.out.println("Good choice! Don't waste your time too much in this stupid game :)) ");
                break;
            }

            if (!location.onLocation()) {
                System.out.println("Game is over :((");
                break;
            }

        }
    }
}
