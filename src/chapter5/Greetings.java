package chapter5;

import java.util.Scanner;

/*
My First Method
Write a Method that asks a user for their name and then greets them by name!
 */
public class Greetings {

    public static void greet(String name){

       System.out.println("hello "+name);


    }


    public static void main(String [] args){
            System.out.println("Whats your name?");
        Scanner scanner = new Scanner(System.in);
        String name= scanner.next();
       greet(name);






    }
}
