package Finding_Odd_Number_Sum;
import java.util.Scanner;
public class Finding_Sum_of_even_numbers_till_facing_odd {
    public static void main(String[] args) {

        //we define our variables sum must be equal to 0 otherwise code doesn't pin a start point
        int x,sum=0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter a number : ");
            x = input.nextInt();
            if (x % 2 ==0){ //we put if here otherwise it adds last odd number to sum
                sum += x;
            }

        }while (x % 2 == 0);//this line allow us to stop after entering an odd number

        System.out.println("Sum of the numbers :"+ sum);
    }
}
