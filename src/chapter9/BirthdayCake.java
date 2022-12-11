package chapter9;

public class BirthdayCake extends Cake {

    private  int candles;

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }

    public BirthdayCake(){
        super("vanilla");
    System.out.println("there are "+candles+" candles and has this flavour"+flavor);
    }


}
