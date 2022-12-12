package chapter10;

public class Banana extends Fruit {
    public void peel(){
        System.out.println("peel the banana");
    }
    public  Banana(){
        setCalories(105);

    }
    @Override
    public void makeJuice(){
        System.out.println("Banana juice is made!!!");
    }

}
