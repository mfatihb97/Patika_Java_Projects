package Week_05.Most_Repetitive_Words;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please write a sentence : ");
        String sentence = input.nextLine();

        // split our sentence to words
        String[] arrOfsentence = sentence.split(" ");

        HashMap<String, Integer> wordCount = new HashMap<>();

        // for loop for adding separated words into HashMap
        for (String word : arrOfsentence) {

            String lowercaseWord = word.toLowerCase();
            // increase count if word is already in the sentence
            if (wordCount.containsKey(lowercaseWord)) {
                int count = wordCount.get(lowercaseWord);
                wordCount.put(lowercaseWord, count + 1);
            } else {
                wordCount.put(lowercaseWord, 1);
            }

        }

        int maxCount = 0;
        String mostRepetitiveWord = "";

        // used this here to find maxCount and mostRepetitiveWord by looping through HashMap
        for (String word : wordCount.keySet()) {
            int count = wordCount.get(word);
            if (count > maxCount) {
                maxCount = count;
                mostRepetitiveWord = word;
            }
        }
        System.out.println("Most repetitive word: " + mostRepetitiveWord + ", Count: " + maxCount);
    }

}

