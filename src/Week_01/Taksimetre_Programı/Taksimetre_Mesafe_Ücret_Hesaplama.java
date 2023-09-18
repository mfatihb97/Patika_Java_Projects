package Taksimetre_Programı;
import java.util.Scanner;
public class Taksimetre_Mesafe_Ücret_Hesaplama {
    public static void main(String[] args) {
        //Değişkenlerimi tanımladım
        double mesafe,ucret;
        Scanner input = new Scanner(System.in);
        //Gidilecek mesafeyi girecek fonksiyonu yazdım
        System.out.println("Gidilecek Mesafe KM : ");
        mesafe = input.nextDouble();
        //Ücret hesaplama fonksiyonunu yazdım
        ucret = (10 + mesafe*2.2) < 20 ? 20 :(10 + mesafe*2.2) ;

        System.out.println("Ödenecek Ücret TL : " + ucret);

    }
}
