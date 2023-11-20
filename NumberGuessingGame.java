import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
   public static void main(String[] args) {
       Random rand = new Random();
       int numberToGuess = rand.nextInt(100) + 1;
       Scanner scanner = new Scanner(System.in);
       int numberOfTries = 0;

       while (true) {
           System.out.println("Guess a number between 1 and 100:");
           int guess = scanner.nextInt();
           numberOfTries++;

           if (guess == numberToGuess) {
               System.out.println("Congratulations! You guessed the number.");
               System.out.println("It took you " + numberOfTries + " tries.");
               break;
           } else if (guess < numberToGuess) {
               System.out.println("Too low!");
           } else {
               System.out.println("Too high!");
           }
       }

       scanner.close();
   }
}
