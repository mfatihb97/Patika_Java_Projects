package Number_sorting;
import java.util.Scanner;
public class Sorting_numbers_decreasing {
    public static void main(String[] args) {
        int x,y,z;
        Scanner input = new Scanner(System.in);

        System.out.println("1st number : ");
        x = input.nextInt();

        System.out.println("2nd number : ");
        y= input.nextInt();

        System.out.println("3rd number");
        z= input.nextInt();

        if((x<y)&&(x<z)){
            if (y<z){
                System.out.println("x<y<z");
            }else {
            System.out.println("x<z<y");
            }

        }else if ((y<x)&&(y<z)){
            if (x<z){
                System.out.println("y<x<z");
            }else {
                System.out.println("y<z<x");
            }
        } else if ((z<x)&&(z<y)) {
            if (x<y){
                System.out.println("z<x<y");
            }else{
                System.out.println("z<y<x");
            }

        }
    }
}
