package chapter4;

import java.util.Scanner;

/*
While loop
Each store employee makes 15$ an hour.Write a program that allows the employee
to enter the number of hours worked for the week. do not allow overtime
 */
public class GrossPayInputValidation {

    public static void main(String [] args){

        // initialise known variables

        int rate =15;
        int maxHours = 40;
        int minHours = 1;
        System.out.println("How many hours did you worked this week?:");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();


        // validate input
        while (hoursWorked>maxHours || hoursWorked< minHours){
            System.out.println("invalid Entry. Your hours must be between 1 and 40");
        hoursWorked=scanner.nextDouble();
        }
        scanner.close();
        //calculate Gross
        double gross = rate*hoursWorked;
        System.out.println("Gross pay:"+gross+" $");
    }
}
