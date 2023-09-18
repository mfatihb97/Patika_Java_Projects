package Min_Max_Calcualtor;
import java.util.Scanner;
public class Min_Max_Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to sort ?");
        int n = input.nextInt();
        int largest = Integer.MIN_VALUE;//This value starts with -2,147,483,648 and updates accordingly with the number we enter,increasingly
        int smallest = Integer.MAX_VALUE;//This value starts with 2,147,483,647 and updated accordingly with the number we enter,decreasingly

        for (int i =1 ; i <=n;i++){
            System.out.println(i+" : enter a number");
            int number = input.nextInt();

            if(number>largest){ //Each time a number enter the program it updated itself if it's greater than numbers entered
                largest=number;
            }
            if (number<smallest){//Each time a number enter the program it updated itself if it's lower than numbers entered
                smallest = number;
            }

        }

        System.out.println("Largest number : "+largest);
        System.out.println("Smallest number : "+smallest);
    }
}
