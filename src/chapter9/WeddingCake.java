package chapter9;

public class WeddingCake extends Cake {
    public int tiers;

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }


    public WeddingCake(){
       super("almond");
        System.out.println("Weddingcake");
    }

}
