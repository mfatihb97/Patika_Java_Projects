//This program computes average of numbers divisible by 3 and 4 up to number you choose

package Finding_Even_Numbers;
import java.util.Scanner;
public class Finding_Even_Numbers {
    public static void main(String[] args) {
        //here we define the parameters we need a count modifier to find average
        double x,average,sum = 0, count=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number : ");
        x = input.nextInt();

        for (int i=0 ; i <= x ; i++){
            if (i % 3 == 0 || i % 4 ==0){
                sum += i; // add the number to the sum
                count++;  // increment the count

            }
        }

        // calculate the average
        average = sum/(count-1);//it counts 0 as a step so we decrease count by 1
        System.out.println("Average of numbers divisible by 3 and 4 : "+ average);

    }
}
