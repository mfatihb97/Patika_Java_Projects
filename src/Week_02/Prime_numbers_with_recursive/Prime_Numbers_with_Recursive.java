//this project creates a method to decide whether a number is prime or not.
package Week_02.Prime_Numbers_with_Recursive;
import java.util.Scanner;

public class Prime_Numbers_with_Recursive {


    static void isPrime(int a){

        if (a==2 || a==3 || a == 5 || a ==7){            // they are prime numbers we exclude them
            System.out.println(a+" is prime.");
        }else if(a%2==0 || a%3==0 || a%5==0 || a%7==0){ // least commons for general
            System.out.println(a+" is not prime.");
        }else {
            System.out.println(a+" is prime.");
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to check if it's prime or not : ");
        int a = input.nextInt();
        isPrime(a);
    }
}
