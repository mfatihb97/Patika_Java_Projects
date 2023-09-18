package Prime_Numbers;

public class Prime_Numbers {
    public static void main(String[] args) {

        for (int i = 2; i<=100;i++){

            if (i==2 || i==3 || i == 5 || i ==7){ // add this line because at the code below they would convert to 0 which in fact prime numbers
                System.out.print(i+" ");
            }

            else  if (i%2==0 || i%3==0 || i%5==0 || i%7==0){
                System.out.print(" ");
            }else {
                System.out.print(i);
            }

       }



    }
}
