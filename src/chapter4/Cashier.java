package chapter4;

import java.util.Scanner;

/*
FOR LOOP
Write a program that will scan a given number of items and tally the cost
 */
public class Cashier {
    public static void main(String[] args){

        //Get number of items to scan
        System.out.println("Enter the number of items you whould like to scan");

        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();


        double total = 0;
        // create loop to iterate throught all of the items and accumulate the costs

        for (int i =0; i<quantity; i ++){
          System.out.println("Enter the cost of the item $:");
          double cost = scanner.nextDouble();
          total = total + cost;
            System.out.println("The total cost is :"+ total+" $");
        }
        scanner.close();
        System.out.println("The total cost is :"+ total+" $");
    }

}
