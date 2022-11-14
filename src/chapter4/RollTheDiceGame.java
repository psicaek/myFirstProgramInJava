package chapter4;
/*
Roll the die for the user (generate a Random number between 1 – 6) and advance the user that number of spaces on the game board. Here’s the code to do this ((import is java.util.Random):

Random random = new Random();
int die = random.nextInt(6) + 1;
After each roll, tell the user which game space they are on and how many more spaces they have to go to win.

Repeat this 4 additional times, for 5 rolls in total.

However, if the user gets to 20 before 5 rolls, end the game - they’ve won.

If they are greater than or less than 20 spaces exactly, they lose.

Remember there are only 20 spaces on the board, so a message like “You advanced to space 22” is a bug.
 */
import java.util.Random;
public class RollTheDiceGame {
 public static void main(String[]args){
    //initiate what we know
    int gameBoard=20;
    int dieRoll=5;
     int totalDie = 0;
     int gamePositionLeft;

        for (int i =1;i<=dieRoll; i++) {

            Random random = new Random();
            int die = random.nextInt(6)+1;
            System.out.println(die);
            totalDie = totalDie + die;
            gamePositionLeft = gameBoard - totalDie;

            System.out.println("Roll #" + i + " You rolled a " + die + " you are now on space " + totalDie + " and have " + gamePositionLeft + " more to go.");
            if (totalDie>gameBoard&& i>3){
                System.out.println("You lose");
            break;

            } else if (totalDie==gameBoard && i>=2) {
                System.out.println("You win");
            break;
            }
            else if (totalDie<gameBoard && i>4){
                System.out.println("you Lose");

            }

        }
    }
}
