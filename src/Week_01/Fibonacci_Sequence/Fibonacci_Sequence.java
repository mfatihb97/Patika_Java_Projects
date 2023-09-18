package Fibonacci_Sequence;
import java.util.Scanner;
public class Fibonacci_Sequence {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int n = input.nextInt();
        int x=0,y=1,z;

        System.out.print("0 1");     //we pass these 2 which have not proper relation in between

        for (int i = 2; i <=n; i++ ){ //we shouldn't be using i in the function,we use it as counter
                                      //if we attach output to i we must provide correlation between i and output which in this case seems hard to achieve
            z=x+y;                    //so we redefine our variables
            System.out.print(" "+ z);
            x=y;
            y=z;

        }
    }
}
