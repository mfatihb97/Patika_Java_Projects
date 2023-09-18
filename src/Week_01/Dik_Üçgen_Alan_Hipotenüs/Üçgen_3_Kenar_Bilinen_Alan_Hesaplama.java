package Dik_Üçgen_Alan_Hipotenüs;
import java.util.Scanner;
public class Üçgen_3_Kenar_Bilinen_Alan_Hesaplama {
    public static void main(String[] args) {

        double x,y,z,t,u;
        Scanner input = new Scanner(System.in);

        System.out.println("1.Kenar :");
        x = input.nextInt();
        System.out.println("2.Kenar :");
        y = input.nextInt();
        System.out.println("3.Kenar :");
        z = input.nextInt();

        u = (x+y+z)/2;
        t = Math.sqrt(u*(u-x)*(u-y)*(u-z));

        System.out.println("Üçgenin Alanı :" + t);



    }
}
