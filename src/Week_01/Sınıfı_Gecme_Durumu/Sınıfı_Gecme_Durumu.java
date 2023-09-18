package Sınıfı_Gecme_Durumu;
import java.util.Scanner;
public class Sınıfı_Gecme_Durumu {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        double counter = 5d;//geçerli durumlar için

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuz : ");
        mat = input.nextInt();
        if(!(mat>=0 && mat<=100)){
            mat = 0;
            counter--;
        }

        System.out.println("Fizik Notunuz : ");
        fizik = input.nextInt();
        if(!(fizik>=0 &&  fizik<=100)){
            fizik = 0;
            counter--;
        }

        System.out.println("Kimya Notunuz : ");
        kimya = input.nextInt();
        if(!(kimya>=0 &&  kimya<=100)){
            kimya = 0;
            counter--;
        }
        System.out.println("Türkçe Notunuz : ");
        turkce = input.nextInt();
        if(!(turkce>=0 &&  turkce<=100)){
            turkce = 0;
            counter--;
        }
        System.out.println("Müzik Notunuz : ");
        muzik = input.nextInt();
        if(!(muzik>=0 &&  muzik<=100)){
            muzik = 0;
            counter--;
        }
        double ortalama_not = (mat+fizik+kimya+turkce+muzik)/ counter;

        if (ortalama_not<=55){
            System.out.println("Sınıfta kaldınız :( ");
            System.out.println("Ortalamanız : "+ortalama_not);
        }else {
            System.out.println("Tebrikler,sınıfı geçtiniz!");
            System.out.println("Ortlamanız : "+ ortalama_not);
        }


        }


    }

