//This project finds out if a number you enter same with it's reverse

public class Palindrom_Numbers {

    static  boolean isPalindrom(int number){

        int temp = number, reverse_of_number=0,last_digit;
        while (temp != 0){
            last_digit = temp%10;                                  // this line of code helps us to get 1st digit
            reverse_of_number = (reverse_of_number*10)+last_digit; // this line returns 1st digit of number entered and gets it to head (f.e 647 mod 10 = 7 then * 10 70 + last_digit)
            temp/=10;
        }

        if (number == reverse_of_number){
            return true;
        }else {
            return false;
        }

        }
        public static void main(String[] args){
        System.out.println(isPalindrom(313));


    }
}
