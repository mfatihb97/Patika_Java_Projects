package Horoscope;
import java.util.Scanner;
public class Horoscope_Finder {
    public static void main(String[] args) {

        int month,day;

        Scanner input = new Scanner(System.in);
        System.out.println( "Month of Birth(number)");
        month = input.nextInt();
        System.out.println("Day of Birth");
        day = input.nextInt();

        if (month==3 && day>=21){
            System.out.println("Aries");
        } else if (month==4 && day <20) {
            System.out.println("Aries");

        } else if (month==4 && day >=21) {
            System.out.println("Taurus");

        } else if (month==5 && day <22) {
            System.out.println("Taurus");

        } else if (month==5 && day>= 22) {
            System.out.println("Gemini");

        } else if (month==6 && day <23) {
            System.out.println("Gemini");

        } else if (month==6 && day>=23) {
            System.out.println("Cancer");

        } else if (month==7 && day< 22 ) {
            System.out.println("Cancer");

        } else if ( month==7 && day >= 23) {
            System.out.println("Leo");

        } else if (month==8 && day < 23) {
            System.out.println("Leo");

        } else if ( month==8 && day >=23){
            System.out.println("Virgo");
        } else if (month==9 && day < 23) {
            System.out.println("Virgo");

        } else if (month==9 && day >=23) {
            System.out.println("Libra");

        } else if (month==10 && day <23 ) {
            System.out.println("Libra");
            
        } else if (month==10 && day>= 23 ) {
            System.out.println("Scorpio");
            
        } else if (month==11 && day<22) {
            System.out.println("Scorpio");

        } else if (month==11 && day>=22){
            System.out.println("Sagittarius");
        } else if (month==12 && day <22  ) {
            System.out.println("Sagittarius");
            
        } else if (month==12 && day>=22) {
            System.out.println("Capricorn");

        } else if (month==1 && day <22) {
            System.out.println("Capricorn");
            
        } else if (month==1 && day >=22) {
            System.out.println("Aquarius");

        } else if (month==2 && day <20) {
            System.out.println("Aquarius");

        } else if (month==2 && day >=20) {
            System.out.println("Pisces");

        }else{
            System.out.println("Pisces");
        }
    }
}
