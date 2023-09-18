package Dik_Üçgen_Alan_Hipotenüs;

import java.util.Scanner;
public class Üçgen_Hipotenüs_Alan_Hesaplama {
    public static void main(String[] args) {

        double x,y,z;
        Scanner input = new Scanner(System.in);

        System.out.println("1.Kenar :");
        x = input.nextInt();
        System.out.println("2.Kenar :");
        y = input.nextInt();

        z = Math.sqrt((x*x)+(y*y));

        System.out.println("Hipotenüs Değeri " +z);

    }
}
