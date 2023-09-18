package Daire_Alan_Cevre_Hesaplama;

import  java.util.Scanner;
public class Daire_alan_cevre {
    public static void main(String[] args) {

        double r,pi=3.14,cevre,alan;

        Scanner input = new Scanner(System.in);

        System.out.println("Dairenin Yarıçapı : ");
        r = input.nextDouble();
        System.out.println("Dairenin Çevresi : ");
        cevre = 2* pi * r;
        System.out.println(cevre);
        System.out.println("Dairenin Alanı : ");
        alan = pi*r*r;
        System.out.println(alan);

    }
}
