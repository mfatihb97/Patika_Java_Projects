package Week_02.Sorting_New_List;
//this program allows you to sort the numbers you entered
import java.util.Arrays;
import java.util.Scanner;

public class Sorting_New_List {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Length of array : ");            
        int x = input.nextInt();
        int[] list = new int[x];

        for (int i = 0; i < x; i++) {                                    // here we need a loop to get inputs of select and attach it to our list
            System.out.println("Enter number " + (i + 1) + " :");
            int n = input.nextInt();
            list[i] = n;
        }
        System.out.println("Order : ");                                 // here used sort method to sort and print our array
        Arrays.sort(list);            
        System.out.println(Arrays.toString(list));


    }
}
