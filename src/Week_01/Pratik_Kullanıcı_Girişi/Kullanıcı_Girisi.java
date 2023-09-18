package Pratik_Kullanıcı_Girişi;
import java.util.Scanner;
public class Kullanıcı_Girisi {
    public static void main(String[] args) {

        String userName,password;

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız : ");
        userName = input.nextLine();

        System.out.println("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("patika123")){
            System.out.println("Giriş Yaptınız ! ");
        }else {
            System.out.println("Bilgileriniz Yanlış !");
        }
    }
}
