package Hesap_Makinesi;
import  java.util.Scanner;
public class Hesap_Makinesi {
    public static void main(String[] args) {

       int x1,x2,secim;

       Scanner input = new Scanner(System.in);
        System.out.println("İlk Sayıyı Giriniz : ");
        x1 = input.nextInt();
        System.out.println("İkinci Sayıyı Giriniz : ");
        x2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz : ");
        secim = input.nextInt();

        switch(secim){
            case 1:
                System.out.println(x1+x2);
                break;
            case 2:
                System.out.println(x1-x2);
                break;
            case 3:
                System.out.println(x1*x2);
                break;
            case 4:
                if (x2==0){
                        System.out.println("0 ile bölüm tanımsızdır! Lütfen tekrar deneyiniz.");
                }else {System.out.println(x1/x2);}
                break;
            default:
                System.out.println("Hatalı işlem ! Tekrar deneyiniz.");


        }

    }
}
