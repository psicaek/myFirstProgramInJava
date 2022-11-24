package chapter7;
/*
* Create a program that allows a user to enter any
* number of grades and provides the with their
* average score, as well as the highest and lowest scores.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Grades {

    private static int grades[];
    private static Scanner scanner= new Scanner(System.in);


    public static void main (String[] args){

        System.out.println("How many scores dou you want to input?");
        int score = scanner.nextInt();
        grades = new int[score];
        getGrades(grades);
        int sum =sumGrades(grades);

System.out.println(String.format("%.2f",averageScore(grades)));

       int highestScore= highestScore(grades);
        System.out.println(highestScore);
        int lowestScore =lowestScore(grades);
        System.out.println(lowestScore);
    }

    public static void getGrades(int [] grades){
        for( int i=0; i<grades.length; i++){
            System.out.println("type your "+(i+1)+" Score");
            grades[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(grades));

    }
    public static int sumGrades(int [] grades){
        int sum=0;
        for (int i=0; i<grades.length; i++){
            sum =grades[i]+sum;

        }
        System.out.println(sum);
        return sum;

    }
    public static int highestScore(int [] grades){
        int high=grades[0];
    for (int i=0; i <grades.length; i++){
        if (grades[i]>high){
            high=grades[i];
        }
    }
        return high;
    }
    public static int lowestScore(int[] grades){
        int low= grades[0];
        for (int i=0; i<grades.length; i++){
            if (grades[i]<low){
                low=grades[i];
            }
        }
        return low;
    }
    public static double averageScore(int [] grades){
        return sumGrades(grades)/grades.length;
    }
}
