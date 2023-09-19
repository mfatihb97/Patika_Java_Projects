package Week_02.Power_of_Numbers_Recursive;
import java.util.Scanner;

public class Power_with_Recursive{

    static void exponent(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n1 = input.nextInt();
        System.out.println("Enter exponent of the number :");
        int n2 = input.nextInt();
        int result=1;

        for (int i=1;i<=n2;i++){
            result*=n1;
        }
        System.out.println("Result is : "+result);
    }


    public static void main(String[] args) {
        exponent();

    }


}




