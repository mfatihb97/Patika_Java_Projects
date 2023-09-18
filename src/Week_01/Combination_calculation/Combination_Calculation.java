package Combination_calculation;
import java.util.Scanner;
public class Combination_Calculation {
    public static void main(String[] args) {

        int n,r,factorialr=1,factorialn=1,factorialnr=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number of combination : ");
        n = input.nextInt();
        System.out.println("Enter second number of combination : ");
        r = input.nextInt();


        for (int i= 1; i <= n;i++ ){
            factorialn *=i;
        }

        for (int i =1 ; i<=r;i++){
            factorialr *=i;

        }
        for (int i = 1 ;i <=(n-r);i++){
            factorialnr*=i;
        }

        int output = factorialn/(factorialr*factorialnr);

        System.out.println("C("+n+","+r+")= "+ output);


    }

}
