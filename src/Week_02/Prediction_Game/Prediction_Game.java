package Week_02.Prediction_Game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Prediction_Game {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        //int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        //System.out.println(number);
        while (right < 5) {
            System.out.print("Please enter your prediction : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Please enter a number between 0-100.");
                if (isWrong) {
                    right++;
                    System.out.println("Too much wrong entry. Remaining entry : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("For next wrong entry remaining entry will be decreased.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Congratulations! Found the number ! Prediction : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Wrong guess !");
                if (selected > number) {
                    System.out.println(selected + " is, greater than mysterious number.");
                } else {
                    System.out.println(selected + " is, less then mysterious number.");
                }

                wrong[right++] = selected;
                System.out.println("Remaining entry : " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println(" You Die ! ");
            System.out.println("Here is the mysterious number : " + number);
            if (!isWrong) {
                System.out.println("Predictions : " + Arrays.toString(wrong));
            }
        }

    }
}
