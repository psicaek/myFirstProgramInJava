package chapter3;


import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args){

        System.out.println("Enter the letter Grade");
        Scanner scanner= new Scanner(System.in);
        String grade = scanner.next();

        String message ;
        switch (grade) {
            case "A":
                message="Exelent Job";
                break;
            case "B" :
                message="Very Well";
            break;
            case "C" :
                message = "Well";
            break;
            case "D":
                message ="Fair";
            break;
            case "F":
                message ="Base";
            break;
            default :
                message = "Falsh Grade";
            break;
        }
        System.out.println(message);






    }
}

