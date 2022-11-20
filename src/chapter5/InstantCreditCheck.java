package chapter5;

import java.util.Scanner;

/*
VARIABLE SCOPE
Write an "instant credit check" program that approves
anyone who makes more than 25000$ and has a credit score
of 700 or better . Reject all others
 */

public class InstantCreditCheck {
    // initialise what we know
        static int requiredSalary= 25000;
        static int requiredCreditScore=700;
        static Scanner scanner=new Scanner(System.in);

   //Get what we do not know*
        public static double getSalary(){
       System.out.println("whats your salary?");
       double salary= scanner.nextDouble();
       return salary;
   }


        public static double getCredit(){
       System.out.println("whats your Credit Score?");
       double score = scanner.nextDouble();
       return score;
   }


    //check if the user is qualified
        public static boolean checkCredit(double salary,double score){
        if (salary>= requiredSalary && score>=requiredCreditScore){
            //System.out.println("You Qualify for the credit");
            return true;
        }
        else
            //System.out.println("You did not Qualify for the credit");
            return false;
    }
    // Notify User
    public static void notify(boolean isQualified){
            if (isQualified==true) {
                System.out.println("You Qualify for the credit");
            }
            else
                System.out.println("You did not Qualify for the credit");
    }

    public static void main(String [] args){
            //Get what we dont know*
            double salary1=getSalary();
            double credit1= getCredit();
            scanner.close();
            boolean isQualified=checkCredit(salary1,credit1);

            //Notify user
            notify(isQualified);
        }
}
