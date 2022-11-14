package chapter4;

import java.util.Scanner;

/*
Nested Loops
Find the average of each students test scores
 */
public class AverageTestScores {
    public static void main(String[] args){
        //initialise what we know
        int numberOfStudents = 2;
        int numberOfTests = 4;
        Scanner scanner = new Scanner(System.in);
        //process all students
        for (int i = 0; i<numberOfStudents; i ++){
            double total = 0;
            for (int x=0; x<numberOfTests;x++){

                System.out.println("give The test Score"+(x+1));

                double testScore = scanner.nextDouble();
                 total =total+testScore;


            }
          double average = total/numberOfTests;
            System.out.println("The average for student "+ (i+1)+" is: "+average);
        }
            scanner.close();
    }
}
