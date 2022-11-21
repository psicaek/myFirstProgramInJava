package chapter5;

import java.util.Scanner;

/*
Calculate the final total of someone's cell phone bill.
Allow the operator to input the plan fee and the number of overage minutes.
 Charge the user o.25 for every minute they were over their plan, and 15%tax on the subtotal;
 Create separate methods to calculate the tax ,overage fees,and final total.
 print the itemized bill!
 */
public class PhoneBillCalculator {
    //initialize what we know
    static double overageMin=0.25;
   static Scanner scanner= new Scanner(System.in);
    // initialise what we don't know

    public static double planCost(){
        System.out.println("Enter the base cost of the plan:");
        double cost= scanner.nextDouble();
        return cost;

    }
    public static int overageMinutes(){
        System.out.println("Enter the overage minutes:");
        int minutes= scanner.nextInt();
        return minutes;

            }
            //Calculate overage in dollars
    public static double overageCost(int minutes ){
        double cost = minutes*overageMin;
        System.out.println(cost);
        return cost;

    }
    //calculate tax
    public static double calculateTax(double cost,double cost2){
        double taxPrice=(cost+cost2)*15/100;
        return taxPrice;
    }
    // make the final bill
    public static void finalBill(double cost,double cost2,double tax){
        System.out.println("Phone Bill Statement");
        System.out.println("plan Cost:"+cost+" $");
        System.out.println("Overage Cost:"+cost2+" $");
        System.out.println("Tax Cost:"+tax+" $");
        double total=cost+cost2+tax;
        System.out.println("Total Cost:"+total+" $");


    }

    public static void main(String [] args){

       double cost =  planCost();
       int minutes=  overageMinutes();
        scanner.close();
       double cost2= overageCost(minutes);
        double tax= calculateTax(cost,cost2);
        finalBill(cost,cost2,tax);
    }


}
