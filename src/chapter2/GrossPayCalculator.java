package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String args[]) {

        //1. Get the number of hours worked
        System.out.println("Enter the number of hours the employee worked.");
        Scanner scanner  = new Scanner(System.in);
        int hours = scanner.nextInt();
        //2. Get the hourly pay rate
        System.out.println("Enter the employees pay rate");
        double payRate = scanner.nextDouble();
        scanner.close();
        //3. Multiply hours and pay rate
        double multiply = hours*payRate;
        //4. Display result
        System.out.println("The employee makes " + multiply + " Euro");
    }
}
