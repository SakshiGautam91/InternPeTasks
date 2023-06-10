import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = 1 + (int)(1000*Math.random());

        int numberOfTrials = 10;

        int i,guess;

        System.out.println("\nA number is chosen between 1 to 1000.Guess the number within 10 trials.");

        for (i = 0; i < numberOfTrials; i++) {
 
            System.out.println("Guess the number:");
 
            // Take input for guessing
            guess = sc.nextInt();
 
            // If the number is guessed
            if (number == guess) {
                System.out.println("Congratulations!" + " You guessed the number.");
                break;
            }
            else if (number > guess && i != numberOfTrials - 1) {
                System.out.println("The number is " + "greater than " + guess);
            }
            else if (number < guess && i != numberOfTrials - 1) {
                System.out.println("The number is" + " less than " + guess);
            }
        }
        if (i == numberOfTrials) {
            System.out.println("You have exhausted" + numberOfTrials + " trials.");
 
            System.out.println("The number was " + number);
        }
        sc.close();

    }
    
}