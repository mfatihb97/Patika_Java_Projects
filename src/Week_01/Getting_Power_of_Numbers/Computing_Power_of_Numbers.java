package Getting_Power_of_Numbers;
import java.util.Scanner;
public class Computing_Power_of_Numbers {
    public static void main(String[] args) {

        int x,y;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number (to be powered): ");
        x = input.nextInt();
        System.out.println("Enter power of number : ");
        y = input.nextInt();

        int total=1;
        for (int i=1 ;i <=y ;i++){

            total*=x;

        }

        System.out.println("Result : " + total);
    }
}
