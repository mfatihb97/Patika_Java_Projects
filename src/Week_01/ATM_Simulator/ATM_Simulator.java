//Here is a program simulating small ATM system.

package ATM_Simulator;
import java.util.Scanner;

public class ATM_Simulator {
    public static void main(String[] args) {

        String userName,password;
        Scanner input = new Scanner(System.in);

        int remaning_entry=3;
        int balance = 1500;
        int select;

        while (remaning_entry>0){
            System.out.println("Username : ");
            userName = input.nextLine();
            System.out.println("Password : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("patika123")){
                System.out.println("Hello, welcome to bank of Patika ");

                do {
                    System.out.println("Please, select your choice below");
                    System.out.println("1-Deposit Money\n2-Withdraw Money\n3-Balance\n4-Exit");
                    select = input.nextInt();

                    switch (select){
                        case 1:
                            System.out.println("Deposit : ");
                            int deposit_money= input.nextInt();
                            balance+=deposit_money;
                            break;

                        case 2:
                            System.out.println("Withdraw : ");
                            int withdraw_amount = input.nextInt();
                            if (withdraw_amount>balance){
                                System.out.println("Insufficient Balance");
                            }else {
                                balance-=withdraw_amount;
                            }break;

                        case 3:
                            System.out.println("Your Balance : "+balance);
                            break;

                        case 4:
                            System.out.println("Have a good day! See you later !");
                            break;
                        default:
                            System.out.println("Wrong choice. Please try again !");


                    }
                }while (select!=4);
                break;

            }else {
                remaning_entry--;
                System.out.println("Wrong username or password! Please try again. ");
                if (remaning_entry==0){
                    System.out.println("Account has been blocked. Please contact with bank.");
                }else {
                    System.out.println("Remaning entry right : "+remaning_entry);
                }
            }









        }
    }
}
