package Kutle_Index;
import java.util.Scanner;
public class Kutle_Index_Hesaplama {
    public static void main(String[] args) {

        double kilo,boy,vucut_indexi;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = input.nextFloat();
        System.out.println("Lütfen kilonuzu (kg cinsinden) giriniz : ");
        kilo = input.nextDouble();
        System.out.println("Vücut Kitle Endeksiniz : ");
        vucut_indexi = kilo/(boy*boy);
        System.out.println(vucut_indexi);


    }
}
