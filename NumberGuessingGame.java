import java.util.Random;
import java.util.Scanner;
class NumberGuessingGame {
    public static void main (String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);

        int guess, attempts = 0, min = 1, max = 100;
        int randomNumber = r.nextInt(min, max + 1); // Generate a random number between 1 and 100

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + min + " and " + max + ". Try to guess it!");

        do{
            System.out.println("Enter your guess: ");
            guess = s.nextInt(); // Read the user's guess
            attempts++; // Increment the number of attempts

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
            }
        } while (guess != randomNumber); // Continue until the correct number is guessed

        s.close();
    }    
}
