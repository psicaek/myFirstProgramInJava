package chapter7;
import java.util.Arrays;
import java.util.Random;

public class LotteryWithSequenceSearchAndBinarySearch {

    private static final int LENGTH=6;

    public static void main(String [] args) {
        int [] lotteryNumbers = LotteryGenerate();
        // sorting the array
        Arrays.sort(lotteryNumbers);
        PrintTicket(lotteryNumbers);
    }
    // Lottery Generate numbers
    public static int[] LotteryGenerate() {

        Random random = new Random();
        int[] lotteryNumbers = new int[LENGTH];
        for (int i=0; i<LENGTH; i++){
            //Generate random number and make sure it doesnt already exists in the array!
            // if doesnt regenerate and search again!
            int numberToSearchFor ;
            do {
                numberToSearchFor = random.nextInt(69) + 1;

                //going to the search
            }while (search (lotteryNumbers, numberToSearchFor) );
            //number is unique if we get here!
                lotteryNumbers[i] = numberToSearchFor;

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

    /**
     *Does a sequential search in the array to find a value
     * @param lotteryNumbers array to search from
     * @param numbers value to search for
     * @return true if found false if not
     */
    public static boolean search(int[] lotteryNumbers,int numberToSearchFor){
        //this is called an enhanced loop.
        // it iterates through the array and each time assings the current element to the "value'
        for (int value : lotteryNumbers){
            if (value == numberToSearchFor){
                return true;
            }
        }
            // if we reach this point then the entire
            // array was searched and the value was not found

        return false;
    }

    //Binary search for the array

    public static boolean binarySearch(int [] lotteryNumbers, int numberToSearchFor){

        //Array must be sorted first
        Arrays.sort(lotteryNumbers);
       int index = Arrays.binarySearch(lotteryNumbers,numberToSearchFor);
       if (index>=0){
        return true;

       }
       else return false;
    }

}
