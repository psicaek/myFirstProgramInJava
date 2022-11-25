package chapter7;

import java.util.Arrays;
import java.util.Scanner;

/*
Make an array that holds its actual values of the days of the week, and then have the user input a number corresponding to some day of the week. And assume that the week starts on Monday.

Your program should output the String that represents the day of the week that corresponds to the number that the user input. For example, if the user inputs the number 1, your program should print “Monday”.

This is an optional exercise. I hope that you'll give it a try.

Good luck.
 */
public class DayOfTheWeek {
private static String[] daysOFWeek={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
private static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){
        System.out.println(Arrays.toString(daysOFWeek));

            output(daysOFWeek,inputUser());
            scanner.close();
    }
    public static int inputUser(){
        System.out.println("Type your number from 1 to 7 to find the day of the week:");
        int number= scanner.nextInt();
        System.out.println(number);
        return number;
    }
    public static int output(String[]days,int numbers){
        for (int i=0;i< daysOFWeek.length; i++){
            if (numbers==i+1){
                System.out.println("Your day is "+ days[i]);

            }
        }
        return 0;
    }
}
