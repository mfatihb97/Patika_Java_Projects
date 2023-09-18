package Manav;
import java.util.Scanner;
public class Manav_Tutar_Hesaplama {
    public static void main(String[] args) {
        //Değişkenlerimizi belirtiyoruz
        double armut,armut_fiyati=2.14,elma,elma_fiyati = 3.67 ,domates,domates_fiyati = 1.11 , muz ,muz_fiyati= 0.95 , patlican , patlican_fiyati= 5.0,toplam_tutar;
        //Sayı çekmek için gereken fonksiyonla değişkenleri bağlıyoruz
        Scanner input = new Scanner(System.in);
        System.out.println("Armut Kaç kilo ? : ");
        armut = input.nextInt() ;
        System.out.println("Elma Kaç kilo ? : ");
        elma = input.nextInt();
        System.out.println("Domates Kaç kilo ? : ");
        domates = input.nextInt();
        System.out.println("Muz Kaç kilo ? : ");
        muz = input.nextInt();
        System.out.println("Patlıcan Kaç kilo ? : ");
        patlican = input.nextInt();
        System.out.println("Toplam tutar : ");
       //Toplam tutar formülümüzü giriyoruz
        toplam_tutar = (armut*armut_fiyati)+(elma*elma_fiyati)+(domates*domates_fiyati)+(muz*muz_fiyati)+(patlican*patlican_fiyati);
        System.out.println(toplam_tutar);
    }
}
