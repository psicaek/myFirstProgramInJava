package chapter8;

import java.util.Scanner;

/*
Validate the complexity of a proposed password by assuring it meets
these rules:
1.at least 8 characters long
2.contain an uppercase letter
3.contain a special character
4.not contain the username
5.not the same as the old password
 */
public class passwordValidatorVol1 {

    private static final String userName = "Psychogyios";
    private static final String oldPassword = "Ioannis";
    private static String password;
    private static Scanner scanner = new Scanner(System.in);
    private static int counter;

    public static void main(String[] args) {

        String pass=getPassword();
        allTogether(pass);

    }
    public static String getPassword() {
        System.out.print("Give your password to validate if it is complex enough:");
        String password = scanner.next();
        //System.out.println(password);
        return password;
    }
    public static String charachter(String password) {
        if (password.length() >= 8) {
            System.out.println("The password is at least 8 characters long!!");
            counter++;
        }

        return password;

    }
    public static void upperCase(String password){

        if (!password.equals(password.toLowerCase())) {
            System.out.println("the password contains an upper case!");
            counter++;
        }
        else
            System.out.println("The password doesn't contain an uppercase");
    }

    public static void oldPassword(String password) {

        if (password.equals(oldPassword)) {
            System.out.println("the password is the same with the old password");

        }
        else System.out.println("The password is not the same with the old password");
        counter++;
    }
    public static void usename (String password){
            if (password.contains(userName)){
                System.out.println("the password contains the username! ");
            }else
                System.out.println("the password doesn't  contains the username!");
        counter++;
    }
    public static void symbol(String password) {
        int count=0;
        int count2= 0;
         for (int i =0; i < password.length(); i++){
            if (!Character.isLetterOrDigit(password.charAt(i))) {

                count++;
            }
           else
             count2++;
         }
         if (count>=1){
             System.out.println("The password has a special character!!!");
             counter++;
         }
         else

         System.out.println("The password doesn't have a special character!!!");

        }


    public static void allTogether(String password){

        charachter(password);
        oldPassword(password);
        upperCase(password);
        usename(password);
        symbol(password);
        if (counter==5){
            System.out.println("The password meets the rules that have been given!!!!! Nice password");
        }else System.out.println("The password doesn't meets the rules that have been given");

    }
}
