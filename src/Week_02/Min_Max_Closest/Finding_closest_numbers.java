package Week_02.Min_Max_Closest;

// this program find the nearest 2 numbers of the number you pick.

import java.util.Arrays;
import java.util.Scanner;

public class Finding_closest_numbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x = input.nextInt();
        int[] list = {3, 40, 33, 27, 51, 72, 93, 41, 46, 38};   // we should add our new value to list to be able to take an action

        int newLength = list.length + 1;                        // here we create new list with length of it incremented by 1 of old list
        int[] new_list = new int[newLength];

        for (int i = 0; i < list.length; i++) {                 // equalize here our new list with the old one
            new_list[i] = list[i];
        }
        new_list[newLength - 1] = x;                            // now we put our new value to end of the list (+1 empty slot after increasing length by 1 above)


        Arrays.sort(new_list);                                  // here we sort the list
        int index_x = Arrays.binarySearch(new_list, x);         // with binarySearch() method we can find the index of our value entered and +1 index of it would be the greater and -1 is the less

        System.out.println("Nearest number greater than the entered number : ");
        System.out.println(new_list[index_x + 1]);
        System.out.println("Nearest number less than the entered number : ");
        System.out.println(new_list[index_x - 1]);

    }
}
