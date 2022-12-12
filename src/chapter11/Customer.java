package chapter11;

public class Customer {
    public static void main(String[] args){

       Product book = new Book();
       book.setPrice(9.99);
       book.setName("Bitcoin");
       book.setColor("Green");
       System.out.println(book.getColor());
        System.out.println(book.getName());
        System.out.println(book.getPrice());

    }
}
