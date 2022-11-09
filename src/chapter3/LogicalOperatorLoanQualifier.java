package chapter3;

import java.util.Scanner;

/* Logical operators
To qualify for a loan a person must make at least 30000$
and have been working at their current job for at least 2 years.
 */
public class LogicalOperatorLoanQualifier {

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
    if (years>yearsOfWork && salary >= salaryPerMonth) {

        System.out.println("The worker qualifies for a loan!");

    }
    else if (years<yearsOfWork || salary <= salaryPerMonth) {

        System.out.println("Sorry you cant get the loan because you don't have enough years on work or enough salary");

        }


    }

}
