package KDV_hesaplama;

import java.util.Scanner;
public class KDV_hesaplama {
    public static void main(String[] args) {
        double x,y,z;
        Scanner input = new Scanner(System.in);

        System.out.println("KDV'siz fiyat : ");
        x = input.nextInt();

        System.out.println("KDV'li Fiyat : ");
        y = x >= 1000 ? x + (x * 0.08) : x + (x* 0.18);
        System.out.println(y);

        System.out.println("KDV tutarı :");
        z = x >= 1000 ? x * 0.08 : x*0.18 ;
        System.out.println(z);

    }
}
