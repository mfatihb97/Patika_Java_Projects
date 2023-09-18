package Armstrong_Numbers;
import java.util.Scanner;
public class sayideneme {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");

        int number = input.nextInt();
        int digit_number=0;
        int digit_value;
        int sum_of_numbers=0;




        while (number !=0){
            digit_value= number%10;
            for (int i = 1 ; ;i++){
                sum_of_numbers +=digit_value;
            }

        }
        System.out.println(sum_of_numbers );
    }
}
