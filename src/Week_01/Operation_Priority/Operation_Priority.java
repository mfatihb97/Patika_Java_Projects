package Operation_Priority;
import java.util.Scanner;
public class Operation_Priority {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 1st number :");
        int n1 = input.nextInt();
        System.out.println("Please enter 2nd number :");
        int n2 = input.nextInt();
        System.out.println("Please enter 3rd number :");
        int n3 = input.nextInt();

        int operation = n1+n2*n3-n2;

        System.out.println(operation);
    }
}
