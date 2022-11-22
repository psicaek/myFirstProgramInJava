package chapter6;

public class phoneBill {

    private int id;
    private double baseCost;
    private int monthlyMinutes;
    private int monthlyMinutesUsed;
    private  int minutes ;

        public  phoneBill(){
                id= 500;
                baseCost=9.99;
                monthlyMinutes=100;
                monthlyMinutesUsed=124;
                minutes=monthlyMinutesUsed-monthlyMinutes;
        }

    public phoneBill(int id){
                this.id=id;
                baseCost=14.99;
                monthlyMinutes=200;
                monthlyMinutesUsed=250;
                 minutes=monthlyMinutesUsed-monthlyMinutes;

        }
     public  phoneBill(int id, double baseCost,int monthlyMinutes,int monthlyMinutesUsed)   {
            this.id=id;
            this.baseCost=baseCost;
            this.monthlyMinutes=monthlyMinutes;
            this.monthlyMinutesUsed=monthlyMinutesUsed;
                minutes=monthlyMinutesUsed-monthlyMinutes;
     }

     public double calculateOverage(){
         double overagePrice;
            if(monthlyMinutesUsed>monthlyMinutes){
                double overagePricePerMinute=0.25;
                 overagePrice=  (minutes)* overagePricePerMinute;

                 return overagePrice;

            }
       return 0;
     }
     public double TotalPrice(){
            return baseCost+calculateOverage();
     }
        public double TotalTax(){
            return TotalPrice()*0.15;
        }
        public double TotalEndPrice(){
            return TotalTax()+TotalPrice();

        }
        public double printBill(){
            System.out.println("The customer id is: "+id+" with a plan of "+baseCost+" $"+" has total of free minutes to talk "+monthlyMinutes+" and a total of extra minutes "+minutes);

            System.out.println("The overage minutes price is: "+calculateOverage());
            System.out.println("The total  price without tax  is: "+TotalPrice());
            System.out.println("The total   tax price   is: "+TotalTax());
            System.out.println("The total  price is: "+ TotalEndPrice());
return 0;


        }


}
