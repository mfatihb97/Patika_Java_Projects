package Power_of_Two;
import java.util.Scanner;
public class Power_of_4_5 {
    public static void main(String[] args) {

        int x;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter threshold number : ");
        x = input.nextInt();


       for (int i =1 ; i <= x ; i*=4){
           System.out.println(i);
       }
       for (int j=1 ; j <= x ; j*=5){
           System.out.println(j);
       }
    }
}
