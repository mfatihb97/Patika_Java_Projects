package Week_05.Patika_Store;

import java.util.Scanner;

public class Patika_Store {
    public static Scanner input = new Scanner(System.in);

    public static void start() {
        System.out.println("Welcome to Patika Store");
        System.out.println("Please select one of the actions below !");
        while (true) {
            System.out.println("================");
            System.out.println("1-Notebook operations");
            System.out.println("2-Mobile phone operations");
            System.out.println("3-List our brands");
            System.out.println("0-Exit");
            System.out.println("Please select your action :");
            int selectAction = input.nextInt();
            switch (selectAction) {
                case 0:
                    System.out.println("Have a good day ! We're hoping to see you back in the store :))");
                    System.exit(0);
                case 1:
                    Notebook.notebookOperation();
                    break;
                case 2:
                    Mobile_Phone.phoneOperation();
                    break;
                case 3:
                    Brand.listBrand();
                    break;
            }

        }
    }
}
