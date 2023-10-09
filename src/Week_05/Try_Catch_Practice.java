package Week_05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch_Practice {

    static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

    public static int indexVal(int index) {
        return arr[index];
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the index you want to get value of :");


        try {
            int index = input.nextInt();
            indexVal(index);
            System.out.println(indexVal(index));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of boundaries of the array ! " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number ! " + e.getMessage());
        } finally {
            System.out.println("This is final block !");
        }

    }
}
