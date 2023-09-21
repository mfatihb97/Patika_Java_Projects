package Week_02.Sorting_New_List;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting_New_List {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Length of array : ");
        int x = input.nextInt();
        int[] list = new int[x];

        for (int i = 0; i < x; i++) {
            System.out.println("Enter number " + (i + 1) + " :");
            int n = input.nextInt();
            list[i] = n;
        }
        System.out.println("Order : ");
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));


    }
}
