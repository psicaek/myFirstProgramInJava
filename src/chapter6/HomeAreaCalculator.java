package chapter6;
/*
Write a class that creates instances of the Rectangle class to find
the total area of two rooms in a house
 */
public class HomeAreaCalculator {

    public static void main(String[] args){
        /*
        Rectangle 1
         */
        Rectangle room1 = new Rectangle(3,7);
        double areaOfRoom1= room1.calculateArea();
        double perimeterOfRoom1 = room1.calculatePerimeter();
        System.out.println("The area of room 1 is: "+areaOfRoom1+"m²");
        System.out.println("The perimeter of room 1 is: "+perimeterOfRoom1+"m");
    }
}
