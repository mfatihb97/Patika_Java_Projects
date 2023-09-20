package Week_02.Salary_Calculator;

public class Employee {                                                        //here we define attributes of our employee

    String name_surname;
    int salary;
    int workHours;
    int hiredYear;


    Employee(String name_surname,int salary,int workHours,int hiredYear){      //here we can amend attributes of our employee

        this.name_surname = name_surname;
        this.salary = salary;
        this.workHours = workHours;
        this.hiredYear = hiredYear;
    }

   double tax(){                                                                // method for calculating tax applied
        double tax;
        double tax_rate = 0.03;
        if (salary > 1000){
            tax=salary*tax_rate;
            return tax;
        }
        else{
            return 0;

        }

   }

   double bonus(){                                                              //method for calculating bonus
        if (workHours >40){
            int bonus;
            bonus = (workHours - 40)*30;
            return bonus;
        }else{
            return 0;
        }

   }
   double raiseSalary(){                                                       //method for calculating raise in salary

        int years_worked = 2021-hiredYear;                                     //simplified the code by adding new years_worked variable
        if (years_worked<10){

            return salary * 0.05;

        }if (years_worked >= 10 && years_worked <20){

            return salary*0.1;

        }else{

            return salary*0.15;
       }


   }


   public String toString(){                                                  //here we print our findings
       System.out.println("Name : "+name_surname);
       System.out.println("Salary : "+salary);
       System.out.println("Working hours : "+workHours);
       System.out.println("Year hired : "+hiredYear);
       System.out.println("Tax : "+tax());
       System.out.println("Bonus : "+bonus());
       System.out.println("Raise : "+ raiseSalary());
       System.out.println("Salary with bonus and tax applied : "+(salary+bonus()-tax()));
       System.out.println("Total salary : "+(salary+raiseSalary()));
       return null;
   }

}
