package chapter3;

import java.util.Scanner;

/* Nested IFS:
To qualify for a loan a person must make at least 30000$
and have been working at their current job for at least 2 years.
 */
public class LoanQualifier {

    public static void main(String []args){
        //initialiase what we know
    int salaryPerMonth =30000;
    int yearsOfWork = 2;
        //Get what we dont know
 System.out.println("give the salary per month?:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        System.out.println("give the number of the years that the worker works?:");
        Scanner scanner1 = new Scanner(System.in);
        double years = scanner1.nextDouble();

       scanner.close();
       scanner1.close();

        //Make decision
    if (years>yearsOfWork) {
        if (salary >= salaryPerMonth) {
            System.out.println("The worker qualifies for a loan!");
        }
        else {
            System.out.println("To get the loan you must get "+(salaryPerMonth-salary)+"$ more!");
        }
    }
    else {
            System.out.println("To get the loan you must work at least "+(yearsOfWork-years)+" years!");
        }


    }

}
