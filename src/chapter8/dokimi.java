package chapter8;

import java.util.Scanner;

public class dokimi {
        private boolean valid;
        private String john;
        private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        var login = login();
        do {
            var neo = login.username();
            login.true1(neo);
            if (login.isValid()) {
                System.out.println("Not good");
            }
        } while (!login.isValid());
        System.out.println("Good 1");
    }

    public dokimi(String john){
        this.john=john;


    }

    public boolean isValid() {
        return valid;
    }

    public static dokimi login(){
        System.out.print("ghapse string:");
        String john = scanner.nextLine();
        return new dokimi(john);

    }
    public String username(){
        System.out.println("grapse neo:");
        return scanner.nextLine();

    }
    public void true1(String  username){
        valid=false;
        String message="";
        if (!username.equals(john)){
            valid=true;
            message+="good to go";
        }
    }
}
