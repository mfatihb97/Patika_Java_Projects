package Week_06.Notepad;

import java.io.*;
import java.util.Scanner;

public class Notepad {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter whatever you want xD :");
        String word = input.nextLine();

        try {
            FileWriter fileWriter = new FileWriter("notepad.txt", true);
            BufferedWriter buffWriter = new BufferedWriter(fileWriter);
            buffWriter.write(word);
            buffWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            BufferedReader buffReader = new BufferedReader(new FileReader("notepad.txt"));
            String line;
            while ((line = buffReader.readLine()) != null) {
                System.out.println(line);
            }
            buffReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
