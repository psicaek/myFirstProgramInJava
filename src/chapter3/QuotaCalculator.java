package chapter3;

import java.util.Scanner;

/*
If  else statement
All sales people are expected to make at least 10 sales each week.
For those who do they will receive a congratulatory message.
for those who dont they are informed of how many sales they where short
 */
public class QuotaCalculator {

public static void main(String []args){
    //Get unknown values
 System.out.println("how many sales:?");
    Scanner scanner = new Scanner(System.in);
    int sales = scanner.nextInt();
    Scanner.close();
    //Initialise values we know
    int mustSales=10;

    //Make a decision ont the path to take- output
    if (sales>=10){
        System.out.println("well done you made the extra sales!!!");
    }
    else {
        int salesMin = mustSales-sales;
        System.out.println("You where short "+salesMin+" sales!");
    }
}
}
