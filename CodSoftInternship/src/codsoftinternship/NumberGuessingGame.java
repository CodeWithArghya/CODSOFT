import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attempts = 5; 
        int rounds = 0;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        boolean playAgain = true;

        while (playAgain) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int guess;
            int attemptsLeft = attempts;

            System.out.println("\nRound " + (rounds + 1) + " - Guess a number between " + minRange + " and " + maxRange);

            while (attemptsLeft > 0) {
                System.out.print("Enter your guess (" + attemptsLeft + " attempts left): ");
                guess = scanner.nextInt();

                if (guess < minRange || guess > maxRange) {
                    System.out.println("Your guess is out of the specified range. Try again.");
                } else if (guess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number: " + targetNumber);
                    score += attemptsLeft;
                    break;
                } else if (guess < targetNumber) {
                    System.out.println("Your guess is too low. Try again.");
                } else {
                    System.out.println("Your guess is too high. Try again.");
                }

                attemptsLeft--;
            }

            if (attemptsLeft == 0) {
                System.out.println("You've run out of attempts. The correct number was: " + targetNumber);
            }

            rounds++;

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            if (!playAgainInput.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Game over! You played " + rounds + " rounds and your total score is: " + score);

        scanner.close();
    }
}
