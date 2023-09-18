package Upsidedown_Triangle;
import java.util.Scanner;
public class Diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int x = input.nextInt();

        for (int i = 1;i<x;i++){

                // for i = 1 number of * must be equal as i = 3 so we put if function here
            if (i==1){
                for (int t = 1; t <=x+3;t++){
                    System.out.print(" ");
                }
                for (int y =1 ; y <=((x*2-1)-6); y++){
                    System.out.print("*");

                }

                }else{

                    for (int k = 1; k <= x+i ;k++){
                    System.out.print(" ");
                }
                    for (int j = 1 ; j <= (x*2-1)-(2*i);j++){ //revaluetion of j is required to transpose the triangle
                    System.out.print("*");
                }
                }
                System.out.println();
        }
    }
}
