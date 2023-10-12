package Week_05.Patika_Store;


import java.util.*;

public class Notebook extends Product {
    private int noteBookID;
    public static Scanner input = new Scanner(System.in);
    public static ArrayList<Notebook> notebookList = new ArrayList<>();

    public Notebook(int price, int discountRate, int stockCount, String name, String brand, int memory, double screenSize, int RAM, int noteBookID) {
        super(price, discountRate, stockCount, name, brand, memory, screenSize, RAM);
        this.noteBookID = noteBookID;
    }

    public static void notebookOperation() {

        // You can use these object as examples.
        // Notebook nb1 = new Notebook(7000, 10, 10, "HUAWEI Matebook 14", "Huawei", 512, 14.0, 16, 1);
        // Notebook nb2 = new Notebook(3700, 10, 10, "LENOVO V14 IGL", "Lenovo", 1024, 14.0, 8, 2);
        //Notebook nb3 = new Notebook(8200, 10, 10, "ASUS Tuf Gaming", "Asus", 2048, 15.6, 32, 3);
        //notebookList.add(nb1);
        //notebookList.add(nb2);
        //notebookList.add(nb3);

        boolean showMenu = true;
        System.out.println("Please select the notebook operation you want to continue with :");
        while (showMenu) {
            System.out.println("1-List current notebooks :");
            System.out.println("2-Add new notebook : ");
            System.out.println("3-Delete notebook : ");
            System.out.println("0-Turn back to menu :");

            int selection = input.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("==================================");
                    System.out.println("1-List current notebooks sorted by ID");
                    System.out.println("2-List current notebooks sorted by brand");
                    int selection2 = input.nextInt();
                    switch (selection2) {
                        case 1:
                            listByID();
                            break;
                        case 2:
                            listByBrand();
                            break;
                    }
                    break;
                case 2:
                    addNotebook();
                    break;
                case 3:
                    listNotebook();
                    deleteNotebook();
                    break;
                case 0:
                    showMenu = false;
            }
        }

    }

    public static void addNotebook() {
        System.out.print("Please enter notebookID : ");
        int notebookID = input.nextInt();
        System.out.print("Please enter notebook name : ");
        String notebookName = input.next();
        System.out.print("Please enter price of the notebook : ");
        int notebookPrice = input.nextInt();
        System.out.print("Please enter brand of the notebook : ");
        String notebookBrand = input.next();
        System.out.print("Please enter notebook RAM : ");
        int notebookRam = input.nextInt();
        System.out.print("Please enter notebook memory : ");
        int notebookMemory = input.nextInt();
        System.out.print("Please enter notebook screen size : ");
        double notebookScreenSize = input.nextDouble();
        System.out.print("Please enter discount rate : ");
        int notebookDiscount = input.nextInt();
        System.out.print("Please enter stock count : ");
        int notebookStock = input.nextInt();

        Notebook notebookAdd = new Notebook(notebookPrice, notebookDiscount, notebookStock, notebookName, notebookBrand, notebookMemory, notebookScreenSize, notebookRam, notebookID);
        if (idCheckNotebook(notebookID)) {
            System.out.println("New item has ben created");
            notebookList.add(notebookAdd);
        } else {
            System.out.println("ID has already in use!");
        }


    }

    public static boolean idCheckNotebook(int id) {
        for (Notebook notebook : notebookList) {
            if (notebook.getNoteBookID() == id) {
                return false;
            }
        }
        return true;
    }

    public static void listByBrand() {

        for (int i = 0; i < notebookList.size() - 1; i++) {
            for (int j = i + 1; j < notebookList.size(); j++) {
                Notebook n1 = notebookList.get(i);
                Notebook n2 = notebookList.get(j);

                if (n1.getBrand().compareTo(n2.getBrand()) > 0) {
                    notebookList.set(i, n2);
                    notebookList.set(j, n1);
                }
            }
        }
        System.out.printf("Notebook List%n");
        System.out.printf(" --------------------------------------------------------------------------------------------------%n");
        System.out.printf("| %-2s | %-30s | %-10s | %-10s | %-12s | %-7s | %-5s | %n ", "ID", "Model", "Price", "Brand", "Memory", "Screen", "RAM");
        System.out.printf("--------------------------------------------------------------------------------------------------%n");
        for (Notebook notebook : notebookList) {
            System.out.printf("| %-2s | %-30s | %-10s | %-10s | %-12s | %-7s | %-5s | %n ", notebook.getNoteBookID(), notebook.getName(), notebook.getPrice() + " TL", notebook.getBrand(), notebook.getMemory() + " gb", notebook.getScreenSize(), notebook.getRAM() + " gb");
        }
        System.out.printf("--------------------------------------------------------------------------------------------------%n");

    }

    public static void listByID() {
        for (int i = 0; i < notebookList.size() - 1; i++) {
            for (int j = i + 1; j < notebookList.size(); j++) {
                Notebook n1 = notebookList.get(i);
                Notebook n2 = notebookList.get(j);

                if (n1.getNoteBookID() - (n2.getNoteBookID()) > 0) {
                    notebookList.set(i, n2);
                    notebookList.set(j, n1);
                }
            }
        }
        System.out.printf("Notebook List%n");
        System.out.printf(" --------------------------------------------------------------------------------------------------%n");
        System.out.printf("| %-2s | %-30s | %-10s | %-10s | %-12s | %-7s | %-5s | %n ", "ID", "Model", "Price", "Brand", "Memory", "Screen", "RAM");
        System.out.printf("--------------------------------------------------------------------------------------------------%n");
        for (Notebook notebook : notebookList) {
            System.out.printf("| %-2s | %-30s | %-10s | %-10s | %-12s | %-7s | %-5s | %n ", notebook.getNoteBookID(), notebook.getName(), notebook.getPrice() + " TL", notebook.getBrand(), notebook.getMemory() + " gb", notebook.getScreenSize(), notebook.getRAM() + " gb");
        }
        System.out.printf("--------------------------------------------------------------------------------------------------%n");

    }


    public static void listNotebook() {

        System.out.printf("Notebook List%n");
        System.out.printf(" --------------------------------------------------------------------------------------------------%n");
        System.out.printf("| %-2s | %-30s | %-10s | %-10s | %-12s | %-7s | %-5s | %n ", "ID", "Model", "Price", "Brand", "Memory", "Screen", "RAM");
        System.out.printf("--------------------------------------------------------------------------------------------------%n");
        for (Notebook notebook : notebookList) {
            System.out.printf("| %-2s | %-30s | %-10s | %-10s | %-12s | %-7s | %-5s | %n ", notebook.getNoteBookID(), notebook.getName(), notebook.getPrice() + " TL", notebook.getBrand(), notebook.getMemory() + " gb", notebook.getScreenSize(), notebook.getRAM() + " gb");
        }
        System.out.printf("--------------------------------------------------------------------------------------------------%n");


    }

    public static void deleteNotebook() {
        System.out.println("======================================================");
        System.out.println("Please enter ID of item to be deleted : ");
        int notebookID = input.nextInt();
        int indexToRemove = -1;
        for (int i = 0; i < notebookList.size(); i++) {
            if (notebookList.get(i).getNoteBookID() == notebookID) {
                indexToRemove = i;
            }
            if (indexToRemove != -1) {
                notebookList.remove(indexToRemove);
                System.out.println("Notebook with ID : " + notebookID + " has been deleted!");
            } else {
                System.out.println("There is no item with such ID!");
            }
        }
    }

    public int getNoteBookID() {
        return noteBookID;
    }

    public void setNoteBookID(int noteBookID) {
        this.noteBookID = noteBookID;
    }


}
