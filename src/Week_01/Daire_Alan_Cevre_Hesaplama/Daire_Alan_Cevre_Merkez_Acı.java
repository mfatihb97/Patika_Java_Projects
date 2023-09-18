package Daire_Alan_Cevre_Hesaplama;
import  java.util.Scanner;
public class Daire_Alan_Cevre_Merkez_Acı {
    public static void main(String[] args) {

        double r,pi=3.14,dilim_alan,alfa;

        Scanner input = new Scanner(System.in);
        System.out.println("Üçgenin Yarıçapı : ");
        r = input.nextDouble();
        System.out.println("Merkez Açı Ölçüsü : ");
        alfa = input.nextDouble();
        System.out.println("Daire Diliminin Alanı : ");
        dilim_alan = (pi*(r*r)*alfa)/360;
        System.out.println(dilim_alan);


    }
}
