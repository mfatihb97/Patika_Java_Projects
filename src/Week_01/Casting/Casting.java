package Casting;
import java.util.Scanner;
public class Casting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a double :");
        double n1 = input.nextDouble();
        System.out.println("Please enter an integer :");
        int n2 = input.nextInt();

        int myInt = (int) n1;
        System.out.println("Decimal to integer : "+myInt);
        double myDouble = n2;
        System.out.println("Integer to decimal :"+myDouble);


    }
}
