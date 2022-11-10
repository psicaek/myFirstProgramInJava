package chapter3;

import java.util.Scanner;

/*
A game that counts how many 10cents,20cents,50cents,5cents,1cent you have
and if you have exactly 1 euro then you win.
But if you have less or more than 1 euro then it tells you exactly how much less or more you need!
 */
public class ChangeForAEuroGame {

    public static void main(String []args){

        System.out.println("How many 1cent have you?:");
        Scanner scanner = new Scanner(System.in);
        int oneCent = scanner.nextInt();

        System.out.println("How many 2cent have you?:");
        int twoCent = scanner.nextInt();
        twoCent = twoCent*2;

        System.out.println("How many 5cent have you?:");
        int fiveCent = scanner.nextInt();
        fiveCent=fiveCent*5;

        System.out.println("How many 10cent have you?:");
        int tenCent = scanner.nextInt();
        tenCent =tenCent*10;

        System.out.println("How many 20cent have you?:");
        int twentyCent = scanner.nextInt();
        twentyCent=twentyCent*20;

        System.out.println("How many 50cent have you?:");
        int fiftyCent = scanner.nextInt();
        fiftyCent=fiftyCent*50;

        int sum = oneCent+twoCent+fiveCent+tenCent+twentyCent+fiftyCent;

        int euro=100;

        int less = sum-euro;

        int more = euro-sum;

         if (euro == sum) {

             System.out.println("You win, you have one Euro!!!");
         } else if (euro> sum) {

             System.out.println("You lose, you need "+more+" cents more!");
         }
         else

             System.out.println("You lose, you have "+less +"cents more");





    }
}
