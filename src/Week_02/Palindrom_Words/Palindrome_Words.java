package Week_02.Palindrom_Words;

import java.util.Scanner;

public class Palindrome_Words {
    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return str.equals(reverse);
    }

    public static void main(String[] args) {

        System.out.println("Please enter a word : ");
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();

        System.out.println(isPalindrome2(x));
    }

}
