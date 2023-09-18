public class Palindrom_Numbers {

    static  boolean isPalindrom(int number){

        int temp = number, reverse_of_number=0,last_digit;
        while (temp != 0){
            last_digit = temp%10;
            reverse_of_number = (reverse_of_number*10)+last_digit;
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
