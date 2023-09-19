//this project help us to better understand recursive method and calculates power of numbers enter by user

import java.util.Scanner;
public class Power_with_Recursive{

    static void exponent(){                        //static called because main method is also static
        
        Scanner input = new Scanner(System.in);    
        System.out.println("Enter a number :");
        int n1 = input.nextInt();
        System.out.println("Enter exponent of the number :");
        int n2 = input.nextInt();
        int result=1;

        for (int i=1;i<=n2;i++){                  //exponent calculation
            result*=n1;
        }
        System.out.println("Result is : "+result);
    }


    public static void main(String[] args) {    //simply print our method
        exponent();

    }


}




