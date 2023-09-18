package Flight_Ticket_Price;
import  java.util.Scanner;
public class Flight_Ticket_Price {
    public static void main(String[] args) {

        int age,travel_method;
        double distance,ticket_price,price_per_KM=0.1;
        Scanner input = new Scanner(System.in);


        System.out.println("Distance you want to travel : ");
        distance = input.nextDouble();
        System.out.println("Age : ");
        age = input.nextInt();
        System.out.println("Travel method:\n 1:One way\2 2:Round trip");
        travel_method = input.nextInt();
        ticket_price = distance*price_per_KM;
        //travel method 1 is for one way trip
        if(travel_method==1){if (age >=1 && age<12 && distance>0){
            double age_discount;
                   age_discount = ticket_price - (ticket_price*0.5);
            System.out.println("Ticket Price : "+age_discount);

            } else if (age>=12 && age<24 && distance>0) {
            double age_discount;
                   age_discount = ticket_price - (ticket_price*0.1);
            System.out.println("Ticket Price : "+age_discount);
            } else if (age>=24 && age<65 && distance>0) {
            System.out.println("Ticket Price : "+ticket_price);

            } else if (age>65 && distance>0) {
            double  age_discount;
                    age_discount = ticket_price - (ticket_price*0.3);
            System.out.println("Ticket Price : "+ age_discount);

            } else if (age<0 || distance<0 ) {
            System.out.println("Entered incorrect data! ");
            
            }

        //travel method 2 is for roound trip
        } else if (travel_method==2) {if (age >=1 && age<12 && distance>0){
            double age_discount,round_trip_discount,round_trip_total;
            age_discount = ticket_price - (ticket_price*0.5);
            round_trip_discount = age_discount - (age_discount*0.2);
            round_trip_total = round_trip_discount*2;
            System.out.println("Ticket Price : "+round_trip_total);

        } else if (age>=12 && age<24 && distance>0) {
            double age_discount,round_trip_discount,round_trip_total;
            age_discount = ticket_price - (ticket_price*0.1);
            round_trip_discount = age_discount - (age_discount*0.2);
            round_trip_total = round_trip_discount*2;
            System.out.println("Ticket Price : "+round_trip_total);
        } else if (age>=24 && age<65 && distance>0) {
            double round_trip_discount,round_trip_total;
            round_trip_discount = ticket_price -(ticket_price*0.2);
            round_trip_total = round_trip_discount*2;
            System.out.println("Ticket Price : "+round_trip_total);

        } else if (age>65 && distance>0) {
            double age_discount,round_trip_discount,round_trip_total;
            age_discount = ticket_price - (ticket_price*0.1);
            round_trip_discount = age_discount - (age_discount*0.2);
            round_trip_total = round_trip_discount*2;
            System.out.println("Ticket Price : "+ age_discount);

        } else if (age<0 || distance<0 ) {
            System.out.println("Entered incorrect data ! ");

        }
        //if you enter a value which has not defined you get the alert below
        }else System.out.println("Entered incorrect data !");


    }
}
