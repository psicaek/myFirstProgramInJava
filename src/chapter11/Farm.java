package chapter11;

public class Farm {

    public static void main(String[] args){

        Animal pig= new Pig();
        pig.eat();
        System.out.println(pig.makeSound());
        Animal duck= new Duck();
        duck.eat();
        System.out.println(duck.makeSound());
    }
}
