//this project help us to better understand recursive method and calculates power of numbers enter by user
package Power_with_Recursive;
import java.util.Scanner;
public class Power_with_Recursive{

    static int exponent(int base,int power){                        //static called because main method is also static

        if (power==0){
            return 1;
        }return base*exponent(base,power-1);                       //re-enter the method inside method like loops so it will run until power reaches 0


    }


    public static void main(String[] args) {    
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int base = input.nextInt();
        System.out.println("Enter power of the number :");
        int power = input.nextInt();
        exponent(base,power);
        System.out.println("Result is :"+exponent(base,power));


    }


}




