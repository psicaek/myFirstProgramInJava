package chapter12;

import chapter7.Grades;

import java.util.HashMap;
import java.util.Map;

public class grades {

    public static void main(String[] args){

       Map<String, Integer> originalGrades = TestResults.getOriginalGrades();
      // System.out.println(originalGrades);

      Map<String, Integer> newGrades = TestResults.getMakeUpGrades();
    //  System.out.println(newGrades);



    for (var student:newGrades.entrySet()) {
        Integer score1 = originalGrades.get(student.getKey());
        Integer score2 = newGrades.get(student.getKey());


        System.out.println("Student : " + student.getKey() + "\n" + "Original Grade:" + originalGrades.get(student.getKey()) + "\n" + "New Grades: " + newGrades.get(student.getKey()));

        System.out.println();
        if (score2 > score1) {
            originalGrades.put(student.getKey(), score2);


        }


    }


        System.out.println("Final Grades:");
        originalGrades.forEach(
                (k,v)->System.out.println("Student: " + k + ", Grade: " + v));




    }
}
