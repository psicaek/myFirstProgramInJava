package chapter6;

import java.util.Scanner;

public class phoneBillCalculator2 {
        Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {


                    phoneBillCalculator2 calculator =new phoneBillCalculator2();
                   phoneBill bill = calculator.getprice();
                   calculator.calculatebill(bill);

            calculator.scanner.close();
        }
        public phoneBill  getprice(){
                    System.out.print("whats the customer id? : ");
                      int id= scanner.nextInt();
            System.out.print("whats the customer plan? : ");
                double plan = scanner.nextDouble();
            System.out.print("whats the customer free minutes? : ");
            int minutes = scanner.nextInt();
            System.out.print("How many minutes did the customer used? : ");
            int extraMinutes = scanner.nextInt();
                    return new phoneBill(id,plan,minutes,extraMinutes);

        }

        public double calculatebill(phoneBill bill){
            return bill.printBill();
        }
}
