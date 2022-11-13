package chapter4;

import java.util.Scanner;

/*
 DO WHILE LOOP
 Write a program that allows a user to enter two numbers
 and then sums up the two numbers. The user should ba able to repeat this action until they indicate they are done
 */
public class AddNumbers {
    public static void main(String[] args) {
       boolean again ;
        do {


            //Give the input
            System.out.println("Give the first number:");
            Scanner scanner = new Scanner(System.in);
            double a = scanner.nextDouble();
            System.out.println("Give the second number:");
            double b = scanner.nextDouble();
            double sum =a+b;
            System.out.println("The sum of the two numbers is "+sum);
            System.out.println("Do you want to do it again? Type in True or False");
            again = scanner.nextBoolean();

        } while (again);



    }

}
