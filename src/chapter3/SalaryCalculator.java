package chapter3;

import java.util.Scanner;

/*
If statement
All sales people get apayment of 1000$ a week.
Salespeople who exceed 10 sales get an additional bonus of 250$.
 */
public class SalaryCalculator {

        public static void main(String [] args){
            // initialiase known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

            //Get values for the unknown
            System.out.println("how many sales did the salesperson did this Week?");
            Scanner scanner = new Scanner(System.in);
            int sales =scanner.nextInt();
            scanner.close();

            //Quick detour for the bonus earners

        if (sales>quota){
            salary = salary + bonus;

        }
            //Calculation part output
            System.out.println("The employees pay is $"+ salary);
        }
}
