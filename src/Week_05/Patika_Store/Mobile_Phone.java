package Week_05.Patika_Store;

import java.util.ArrayList;
import java.util.Scanner;

public class Mobile_Phone extends Product {
    private int phoneID;
    private int battery;
    private String colour;

    public static Scanner input = new Scanner(System.in);

    public static ArrayList<Mobile_Phone> phoneList = new ArrayList<>();

    public Mobile_Phone(int price, int discountRate, int stockCount, String name, String brand, int memory, double screenSize, int RAM, int phoneID, int battery, String colour) {
        super(price, discountRate, stockCount, name, brand, memory, screenSize, RAM);
        this.phoneID = phoneID;
        this.battery = battery;
        this.colour = colour;
    }

    public static void phoneOperation() {

        boolean showMenu = true;
        System.out.println("Please select the notebook operation you want to continue with :");
        while (showMenu) {
            System.out.println("1-List current phones :");
            System.out.println("2-Add new phone : ");
            System.out.println("3-Delete phone : ");
            System.out.println("0-Turn back to menu :");

            int selection = input.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("==================================");
                    System.out.println("1-List current phones sorted by ID : (Press 1)");
                    System.out.println("2-List current phones sorted by brand : (Press 2 )");
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
                    addPhone();
                    break;
                case 3:
                    listPhone();
                    deletePhone();
                    break;
                case 0:
                    showMenu = false;
            }
        }

    }

    public static void addPhone() {
        System.out.print("Please enter phoneID : ");
        int phoneID = input.nextInt();
        System.out.print("Please enter phone name : ");
        String phoneName = input.next();
        System.out.print("Please enter price of the phone: ");
        int phonePrice = input.nextInt();
        System.out.print("Please enter brand of the phone : ");
        String phoneBrand = input.next();
        System.out.print("Please enter phone RAM : ");
        int phoneRam = input.nextInt();
        System.out.print("Please enter phone memory : ");
        int phoneMemory = input.nextInt();
        System.out.print("Please enter phone screen size : ");
        double phoneScreenSize = input.nextDouble();
        System.out.print("Please enter discount rate : ");
        int phoneDiscount = input.nextInt();
        System.out.print("Please enter stock count : ");
        int phoneStock = input.nextInt();
        System.out.print("Please enter battery power : ");
        int phoneBattery = input.nextInt();
        System.out.println("Please enter colour : ");
        String phoneColour = input.next();


        Mobile_Phone phoneAdd = new Mobile_Phone(phonePrice, phoneDiscount, phoneStock, phoneName, phoneBrand, phoneMemory, phoneScreenSize, phoneRam, phoneID, phoneBattery, phoneColour);
        if (idCheckPhone(phoneID)) {
            System.out.println("New item has ben created");
            phoneList.add(phoneAdd);
        } else {
            System.out.println("ID has already in use!");
        }


    }

    public static boolean idCheckPhone(int id) {
        for (Mobile_Phone phone : phoneList) {
            if (phone.getPhoneID() == id) {
                return false;
            }
        }
        return true;
    }


    public static void listByBrand() {

        for (int i = 0; i < phoneList.size() - 1; i++) {
            for (int j = i + 1; j < phoneList.size(); j++) {
                Mobile_Phone p1 = phoneList.get(i);
                Mobile_Phone p2 = phoneList.get(j);

                // Compare and swap if necessary
                if (p1.getBrand().compareTo(p2.getBrand()) > 0) {
                    // Swap the elements
                    phoneList.set(i, p2);
                    phoneList.set(j, p1);
                }
            }
        }
        System.out.printf("Mobile Phone List%n");
        System.out.printf(" ----------------------------------------------------------------------------------------------------------%n");
        System.out.printf("| %-2s | %-25s | %-5s | %-10s | %-8s | %-7s | %-8s | %-7s   | %-6s |  %n ", "ID", "Model", "Price", "Brand", "Memory", "Screen", "Battery", "RAM", "Colour");
        System.out.printf("----------------------------------------------------------------------------------------------------------%n");
        for (Mobile_Phone phone : phoneList) {
            System.out.printf("| %-2s | %-25s | %-5s | %-10s | %-8s | %-7s | %-8s | %-7s | %-6s | %n", phone.getPhoneID(), phone.getName(), phone.getPrice() + " TL", phone.getBrand(), phone.getMemory() + " gb", phone.getScreenSize(), phone.getBattery(), phone.getRAM() + " gb", phone.getColour());
        }
        System.out.printf(" ----------------------------------------------------------------------------------------------------------%n");
    }

    public static void listByID() {

        for (int i = 0; i < phoneList.size() - 1; i++) {
            for (int j = i + 1; j < phoneList.size(); j++) {
                Mobile_Phone p1 = phoneList.get(i);
                Mobile_Phone p2 = phoneList.get(j);

                // Compare and swap if necessary
                if (p1.getPhoneID() - (p2.getPhoneID()) > 0) {
                    // Swap the elements
                    phoneList.set(i, p2);
                    phoneList.set(j, p1);
                }
            }
        }
        System.out.printf("Mobile Phone List%n");
        System.out.printf(" ----------------------------------------------------------------------------------------------------------%n");
        System.out.printf("| %-2s | %-25s | %-5s | %-10s | %-8s | %-7s | %-8s | %-7s   | %-6s |  %n ", "ID", "Model", "Price", "Brand", "Memory", "Screen", "Battery", "RAM", "Colour");
        System.out.printf("----------------------------------------------------------------------------------------------------------%n");
        for (Mobile_Phone phone : phoneList) {
            System.out.printf("| %-2s | %-25s | %-5s | %-10s | %-8s | %-7s | %-8s | %-7s | %-6s | %n", phone.getPhoneID(), phone.getName(), phone.getPrice() + " TL", phone.getBrand(), phone.getMemory() + " gb", phone.getScreenSize(), phone.getBattery(), phone.getRAM() + " gb", phone.getColour());
        }
        System.out.printf(" ----------------------------------------------------------------------------------------------------------%n");

    }

    public static void listPhone() {
        System.out.printf("Mobile Phone List%n");
        System.out.printf(" ----------------------------------------------------------------------------------------------------------%n");
        System.out.printf("| %-2s | %-25s | %-5s | %-10s | %-8s | %-7s | %-8s | %-7s   | %-6s |  %n ", "ID", "Model", "Price", "Brand", "Memory", "Screen", "Battery", "RAM", "Colour");
        System.out.printf("----------------------------------------------------------------------------------------------------------%n");
        for (Mobile_Phone phone : phoneList) {
            System.out.printf("| %-2s | %-25s | %-5s | %-10s | %-8s | %-7s | %-8s | %-7s | %-6s | %n", phone.getPhoneID(), phone.getName(), phone.getPrice() + " TL", phone.getBrand(), phone.getMemory() + " gb", phone.getScreenSize(), phone.getBattery(), phone.getRAM() + " gb", phone.getColour());
        }
        System.out.printf(" ----------------------------------------------------------------------------------------------------------%n");

    }

    public static void deletePhone() {
        System.out.println("======================================================");
        System.out.println("Please enter ID of item to be deleted : ");
        int phoneID = input.nextInt();
        int indexToRemove = -1;
        for (int i = 0; i < phoneList.size(); i++) {
            if (phoneList.get(i).getPhoneID() == phoneID) {
                indexToRemove = i;
            }
            if (indexToRemove != -1) {
                phoneList.remove(indexToRemove);
                System.out.println("Notebook with ID : " + phoneID + " has been deleted!");
            } else {
                System.out.println("There is no item with such ID!");
            }
        }
    }


    public int getPhoneID() {
        return phoneID;
    }

    public void setPhoneID(int phoneID) {
        this.phoneID = phoneID;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }


}
