package Week_02.Repetitive_Numbers_Array;

import java.util.Arrays;

public class Finding_Frequency {

    static boolean isFind(int[] arr, int value) {                        // added this method to find unique values in the array
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Repetitive Numbers : ");
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {                         // here we find unique values of the array and return it as an array
            for (int j = 0; j < list.length; j++) {
                if ((list[i] == list[j])) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];

                    }
                    break;
                }
            }
        }
        int[] copy_duplicate = Arrays.copyOf(duplicate, startIndex);    // here we create a new array consisting of unique values of array above(list)
        System.out.println(Arrays.toString(copy_duplicate));            // startIndex is our length of new array


        int counter = 0;
        int temp_counter = 0;

        for (int k = 0; k < startIndex; k++) {                          // here we search our new array values in the first list(list) and count the repetitive
            for (int m = 0; m < list.length; m++) {
                if (copy_duplicate[k] == list[m]) {
                    temp_counter++;                                     // here we created temp_counter and equalized it to 0 for every loop
                }
            }
            System.out.println(copy_duplicate[k] + " repeated " + temp_counter + " times.");
            temp_counter = counter;
        }


    }
}
