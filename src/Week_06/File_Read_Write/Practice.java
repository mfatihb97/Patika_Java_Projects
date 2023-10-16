package Week_06.File_Read_Write;

import java.io.*;

public class Practice {
    public static void main(String[] args) throws Exception {

        BufferedWriter buffWriter = new BufferedWriter(new FileWriter("myFile.txt", false));
        buffWriter.write(String.valueOf(5));
        buffWriter.newLine();
        buffWriter.write(String.valueOf(10));
        buffWriter.newLine();
        buffWriter.write(String.valueOf(20));
        buffWriter.newLine();
        buffWriter.write(String.valueOf(12));
        buffWriter.newLine();
        buffWriter.write(String.valueOf(33));
        buffWriter.newLine();
        buffWriter.close();

        FileReader fReader = new FileReader("myFile.txt");
        BufferedReader buffReader = new BufferedReader(fReader);
        String line;

        int sum = 0;
        while ((line = buffReader.readLine()) != null) {
            System.out.println(Integer.parseInt(line));
            sum += Integer.parseInt(line);

        }
        System.out.println(sum);

    }
}
