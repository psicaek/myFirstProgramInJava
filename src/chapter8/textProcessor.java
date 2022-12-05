package chapter8;

import java.util.Scanner;
import java.lang.String;


/*
1.write a method that counts the number of words
in a string and prints them individually in a new
line.

2.write a method that prints a given string backwards.
For examole if  given  camel it will print lemac.

3.Write a method that adds spaces to a jumbled String
where all words are written together with no spaces
each new word begins with a capital letter!
 */
public class textProcessor {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

      //allTogether();
      AddSpaces("HeyWorld!ItsJohn");

    }


    public static String getInput() {
        System.out.println("Write as many words as you want:");
        String string = scanner.nextLine();

        return string;
    }

    public static void countWords(String text) {

        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words:", numberOfWords);
        System.out.println(message);

        for (int i=0; i<numberOfWords; i++){
            System.out.println("your "+i+" word is:"+  words[i]);
        }
    }
    public static void reverseString(String text){

        for (int i=text.length()-1; i>=0; i--){

            System.out.print(text.charAt(i));
        }

    }
    public static void allTogether(){
        countWords(getInput());
        reverseString(getInput());
    }

    public static void AddSpaces(String text){
        var modifiedText = new StringBuilder(text);
        for (int i=0; i<modifiedText.length(); i++){

            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i," ");
            i++;
            }

        }
        System.out.print(modifiedText);

    }

}