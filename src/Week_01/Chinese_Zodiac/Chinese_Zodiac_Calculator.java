package Chinese_Zodiac;
import java.util.Scanner;
public class Chinese_Zodiac_Calculator {
    public static void main(String[] args) {

        int year_of_birth;

        Scanner input = new Scanner(System.in);
        System.out.println("Year of birth : ");
        year_of_birth = input.nextInt();

        if (year_of_birth % 12 == 0){
            System.out.println("Chinese Zodiac : Monkey");
        } else if (year_of_birth % 12 == 1) {
            System.out.println("Chinese Zodiac : Rooster");

        } else if (year_of_birth % 12 == 2) {
            System.out.println("Chinese Zodiac : Dog");

        } else if (year_of_birth % 12 == 3) {
            System.out.println("Chinese Zodiac : Pig");

        } else if (year_of_birth % 12 == 4) {
            System.out.println("Chinese Zodiac : Rat");

        } else if (year_of_birth % 12== 5 ) {
            System.out.println("Chinese Zodiac : Ox");

        } else if (year_of_birth % 12 == 6) {
            System.out.println("Chinese Zodiac : Tiger");

        } else if (year_of_birth % 12 == 7) {
            System.out.println("Chinese Zodiac : Rabbit");

        } else if (year_of_birth % 12 == 8) {
            System.out.println("Chinese Zodiac : Dragon");

        } else if (year_of_birth % 12 == 9) {
            System.out.println("Chinese Zodiac : Snake");

        } else if (year_of_birth % 12 == 10) {
            System.out.println("Chinese Zodiac : Horse");

        } else if (year_of_birth % 12 == 11) {
            System.out.println("Chinese Zodiac : Goat");

        }
    }
}
