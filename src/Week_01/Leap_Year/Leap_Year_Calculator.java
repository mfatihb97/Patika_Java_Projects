/* With this program we will define whether a year we choose is a leap year or not.
if a year could divisible with 4 without an odd then it's a leap year which is the basic definition of leap year.
if a year could divisible with 400 but not with 100 then it's a leap year again visa versa.
*/


package Leap_Year;
import java.util.Scanner;
public class Leap_Year_Calculator {
    public static void main(String[] args) {

        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year : ");
        year = input.nextInt();

        if (year % 4 == 0 && year % 400 == 0){
            System.out.println(year+" is leap year !");
        } else if (year % 4 == 0 && year % 100 == 0) {
            System.out.println(year+" is not leap year !");
            
        } else if (year % 4 == 1 || year % 4 == 2 || year % 4 ==3){
            System.out.println(year+" is not leap year !");
        }else System.out.println(year+ " is leap year !");

    }
}
