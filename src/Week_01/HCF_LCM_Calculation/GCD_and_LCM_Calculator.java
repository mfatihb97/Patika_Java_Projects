package HCF_LCM_Calculation;
import java.util.Scanner;
public class GCD_and_LCM_Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int n1 = input.nextInt();
        System.out.println("Enter 2nd number : ");
        int n2 = input.nextInt();
        int GCD=1;
        int i =1;

        while (i <= n1 && i <= n2){
            if (n1 % i == 0 && n2 % i == 0){
                GCD=i;
            }
            i++;
        }
        System.out.println("GCD of "+n1+" and "+ n2 +" is "+GCD);

        System.out.println("----------");

        int j = 1;
        int LCM =1;


        while (j <= n1*n2){
            if (j % n1== 0 && j % n2 ==0){
                LCM=j;
                break;
            }
            j++;
        }
        System.out.println("LCM of "+n1+" and "+n2+" is "+LCM);


    }
}
