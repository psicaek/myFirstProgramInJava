package chapter9;

public class TasteTester {

    public static void main(String[] args){

        Cake cake =new Cake("Shokolade");
        cake.setPrice(29.9);
        System.out.print(cake.getFlavor()+cake.getPrice());
        WeddingCake weddingCake=new WeddingCake();
        weddingCake.setFlavor("margarita");
        System.out.println(weddingCake.getFlavor()+weddingCake.getPrice());
        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setCandles(5);
        birthdayCake.setPrice(49.95);
        System.out.println("Birthday cake flavor: " + birthdayCake.getFlavor());
        System.out.println("Birthday cake price: " + birthdayCake.getPrice());
}
}
