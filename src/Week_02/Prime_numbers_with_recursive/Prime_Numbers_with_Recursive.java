//this project creates a method to decide whether a number is prime or not.
package Week_02.Prime_Numbers_with_Recursive;
import java.util.Scanner;

public class Prime_Numbers_with_Recursive {


    static boolean isPrime(int number  ,int divisor){

        if (number==divisor){
            return true;
        }
4
        if (number%divisor==0){
            return false;
        }
        else {
            return  isPrime(number,divisor+1);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to check if it's prime or not : ");
        int number = input.nextInt();
        if (isPrime(number, 2)){
            System.out.println(number+" is prime.");
        }else {
            System.out.println(number+" is not prime");
        }
    }
}
