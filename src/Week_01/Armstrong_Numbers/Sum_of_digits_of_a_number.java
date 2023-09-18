//This program allows you to sum digit values of a number

import java.util.Scanner;
public class Sum_of_digits_of_a_number {
    public static void main(String[] args) {

        //inserted number generator
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");

        //variables
        int number = input.nextInt();
        int digit_value;
        int sum_of_numbers=0;

        while (number !=0){
            digit_value= number%10;
            sum_of_numbers +=digit_value;// sum the values of digits
            number/=10;                 // updates our number f.e 2451 turns 245 then 24 and mod 10 gets firs 1 then 5 then 4 ... and sum

        }
        System.out.println(sum_of_numbers);
    }
}
