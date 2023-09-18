package Hava;

import java.util.Scanner;

public class Activities_According_to_Temprature {
    public static void main(String[] args) {
        int temprature;

        Scanner input = new Scanner(System.in);
        System.out.println("Temprature : ");
        temprature = input.nextInt();

        if(temprature<5){
            System.out.println("You can go skiing.");
        } else if (temprature>5 && temprature<=15) {
            System.out.println("You can go cinema.");

        } else if (temprature>15 && temprature<=25) {
            System.out.println("You can go picnic.");

        }else {
            System.out.println("You can go swimming.");
        }
    }
}
