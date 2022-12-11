package chapter10;

public class Zoo {
    public static void main(String[] args){
        Dog rocky = new Dog();
        rocky.fetch();
        feed(rocky);
        Animal john=new Dog();
        john.makeSound();
        feed(john);
        john=new Cat();
        john.makeSound();
        ((Cat) john).scratch();
        feed(john);

    }
    public static void feed(Animal animal){
        if (animal instanceof Dog){
            System.out.println("Dog food");
        }
        else if (animal instanceof Cat){
            System.out.println("cat food");
        }



    }
}
