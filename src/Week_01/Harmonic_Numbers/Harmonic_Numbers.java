package Harmonic_Numbers;
import java.util.Scanner;
public class Harmonic_Numbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x = input.nextInt();
        double result = 0;

        for (double i = 1; i<= x ;i++){
            result += (1/i);


        }
        System.out.println(result);
    }
}
