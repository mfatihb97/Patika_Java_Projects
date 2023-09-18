package Perfect_Numbers;
import java.util.Scanner;
public class Perfect_Numbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = input.nextInt();//we define our variables 1 for number and 1 for sum of divisors
        int sum=0;

        for (int i = 1;i <= n;i++){ //here we sum up all the divisors and the number itself
            if (n%i == 0 ){
                sum+=i;
            }
        }if (sum/2 == n){ //above calculation adds the number itself so if we divide it by 2 we can find sum of divisors
            System.out.printf( n +" is perfect number.");

        }else System.out.printf( n +" is not perfect number.");

    }
}
