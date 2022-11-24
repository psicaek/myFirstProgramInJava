package chapter7;

import java.util.Arrays;
import java.util.Random;


public class LotteryQuickPick {
    private static final int LENGTH=6;

    public static void main(String [] args) {
        int [] lotteryNumbers = LotteryGenerate();
            PrintTicket(lotteryNumbers);
    }
// Lottery Generate numbers
    public static int[] LotteryGenerate() {

        Random random = new Random();
        int[] lotteryNumbers = new int[LENGTH];
        for (int i=0; i<LENGTH; i++){
            lotteryNumbers [i] = random.nextInt(69) + 1;
        }

        //System.out.println(Arrays.toString(lotteryNumbers));
        return lotteryNumbers;
    }

// lottery Print numbers
    public static void PrintTicket(int lotteryNumbers[]){
        for (int i=0; i<LENGTH; i++) {
            System.out.print(lotteryNumbers[i]+" | ");
        }
    }



}




