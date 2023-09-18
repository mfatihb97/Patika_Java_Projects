package Upsidedown_Triangle;
import java.util.Scanner;

public class Upsidedown_Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int x = input.nextInt();

        for (int i = 1;i<x;i++){


            for (int k = 1; k <= x+i ;k++){
                System.out.print(" ");
            }
            for (int j = 1 ; j <= (x*2-1)-(2*i);j++){ //revaluetion of j is required to transpose the triangle
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
