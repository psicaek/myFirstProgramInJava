package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExeptionHandling {
    public static void main(String[] args) {

        createNewFile();
        numbersExeptionHandling();
    }

    public static void createNewFile() {
        File file = new File("desktop/file1.txt");
        try {
            file.createNewFile();
        } catch (IOException ex) {
            System.out.println("Directory does not exist.");
            ex.printStackTrace();
        }
    }

    public static void numbersExeptionHandling() {

        File file = new File("resources/numbers.txt");
        Scanner fileReader=null;
        try {
            fileReader = new Scanner(file);
            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }finally {
        fileReader.close();
        }
    }
}
