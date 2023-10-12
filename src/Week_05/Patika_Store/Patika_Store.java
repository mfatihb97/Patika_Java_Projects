package Week_05.Patika_Store;

import java.util.Scanner;

public class Patika_Store {
    public static Scanner input = new Scanner(System.in);

    public static void start() {
        Notebook nb1 = new Notebook(7000, 10, 10, "HUAWEI Matebook 14", "Huawei", 512, 14.0, 16, 1);
        Notebook nb2 = new Notebook(3700, 10, 10, "LENOVO V14 IGL", "Lenovo", 1024, 14.0, 8, 2);
        Notebook nb3 = new Notebook(8200, 10, 10, "ASUS Tuf Gaming", "Asus", 2048, 15.6, 32, 3);

        Notebook.notebookList.add(nb1);
        Notebook.notebookList.add(nb2);
        Notebook.notebookList.add(nb3);

        Mobile_Phone mb1 = new Mobile_Phone(3199, 10, 10, "SAMSUNG GALAXY A51", "Samsung", 128, 6.5, 6, 1, 4000, "BLACK");
        Mobile_Phone mb2 = new Mobile_Phone(7379, 10, 10, "iPhone 11 64 GB", "Apple", 64, 6.1, 6, 2, 3000, "BLUE");
        Mobile_Phone mb3 = new Mobile_Phone(4000, 10, 10, "Redmi Note 10 Pro 8GB", "Xiaomi", 128, 6.5, 12, 3, 4000, "WHITE");
        Mobile_Phone.phoneList.add(mb1);
        Mobile_Phone.phoneList.add(mb2);
        Mobile_Phone.phoneList.add(mb3);

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
