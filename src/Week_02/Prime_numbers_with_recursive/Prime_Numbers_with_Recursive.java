//this project creates a method to decide whether a number is prime or not.
package Week_02.Prime_Numbers_with_Recursive;
import java.util.Scanner;

public class Prime_Numbers_with_Recursive {


    static boolean isPrime(int number  ,int divisor){

        if (number==divisor){                            //here divisior has value 2 initially and 2 is only even number which is prime so we pass it
            return true;
        }

        if (number%divisor==0){                         //if the number can be divided by 2 then it's not prime and code ends
            return false;
        }
        else {
            return  isPrime(number,divisor+1);        //divisor incremented by 1 to check all the numbers till number==divisor on the code above
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
