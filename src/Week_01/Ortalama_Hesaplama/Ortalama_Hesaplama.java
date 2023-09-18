package Ortalama_Hesaplama;
import java.util.Scanner;
public class Ortalama_Hesaplama {
    public static void main(String[] args) {
        //Değişkenlerimiz
        int mat,fizik,kimya,turkce,tarih,muzik;
        //Consola veri girebilmemiz için (veri çekmek) gereken fonksiyonumuz
        Scanner input = new Scanner(System.in);
        //Notlar
        System.out.println("Matematik Notunuz : ");
        mat = input.nextInt();

        System.out.println("Fizik Notunuz : ");
        fizik = input.nextInt();

        System.out.println("Kimya Notunuz : ");
        kimya = input.nextInt();

        System.out.println("Türkçe Notunuz : ");
        turkce = input.nextInt();

        System.out.println("Tarih Notunuz : ");
        tarih = input.nextInt();

        System.out.println("Müzik Notunuz : ");
        muzik = input.nextInt();

        System.out.println("Ortalama Notunuz : ");
        double ortalama_not = (mat+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println(ortalama_not);

        String x = (ortalama_not >= 60) ? "Geçti" : "Kaldı";
        System.out.println(x);

    }
}
