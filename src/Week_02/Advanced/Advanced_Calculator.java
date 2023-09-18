import java.util.Scanner;

public class Advanced_Calculator {



    static void mode(){

        Scanner scan = new Scanner(System.in);
        int number,mode, result;
        System.out.println("Number : ");
        number = scan.nextInt();
        System.out.println("Mode : ");
        mode = scan.nextInt();

        result = number% mode;
        System.out.println("Result "+result);

    }

    static void rectangle(){
        Scanner scan = new Scanner(System.in);
        System.out.println("1st Edge of Rectangle : ");
        int a = scan.nextInt();
        System.out.println("2nd Edge of Rectangle :");
        int b = scan.nextInt();
        System.out.println("Perimeter of Rectangle :");
        int perimeter = 2*(a+b);
        System.out.println(perimeter);
        System.out.println("Area of Rectangle : ");
        int area = a*b;
        System.out.println(area);


    }


    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        System.out.println("Please enter 0 when you want to end sum");
        while (true) {
            System.out.print("number "+ i++ +":");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number of entry :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print("number "+ i +":" );
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Result : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;
        System.out.println("Please enter 1 when you want to end multiplication");

        while (true) {
            System.out.print(" Number"+ i++ +":");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Result : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number of entry :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(" Number "+i+ ":");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Divisor can't be 0.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number :");
        int base = scan.nextInt();
        System.out.print("Exponent :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result : " + result);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Sum\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Exponent\n"
                + "6- Factorial\n"
                + "7- Mode\n"
                + "8- Rectangle Area ve Perimeter\n"
                + "0- Exit";

        do {
            System.out.println(menu);
            System.out.print("Select one of the process above :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mode();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Wrong entry ! Please enter a new number.");
            }
        } while (select != 0);


    }
}