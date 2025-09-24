import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1; // 1 to 100
        int guess;
        int attempts = 0;
        boolean guessedCorrectly = false;

        System.out.println(" Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("Can you guess it?");

        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess == numberToGuess) {
                guessedCorrectly = true;
                System.out.println(" Congratulations! You guessed the number in " + attempts + " attempts.");
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        sc.close();
    }
}
