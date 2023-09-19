package Week_02.Recursive_n_Series;
import java.util.Scanner;

/* This project allows you to calculate symetric of itself by substracting 5 until it reaches to 0 or below, then
   adds 5 until it reaches primary number entered.In order to achieve this we need 2 methods one for increasing
   the number and other for decreasing it.
*/
public class Series_of_method {


    //this method decreases number till it reaches 0 or below
    static int decreaseN(int N,int tempN){
        System.out.println(N);
        if (N>0){
            N-=5;
            return decreaseN(N,tempN);      //recursive method here to go down to 0 or below
        }else{
            increaseN(N,tempN);            //here we jump to our increase method
        }
        return 0;
    }
    //after subtracting fives till 0 or below we need to increase our number as it's primary value
    static int increaseN(int N, int tempN) {
        if (N<tempN){                       //here we need temporary number to achieve our first value of N
            N+=5;
            System.out.println(N);
            return increaseN(N,tempN);
        }else return N;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number :");
        int N = input.nextInt();
        decreaseN(N,N);


    }
}
