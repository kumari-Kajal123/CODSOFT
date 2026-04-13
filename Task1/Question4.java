import java.util.Random;
import java.util.Scanner;

public class Question4 {
    public static void checkGuess ( int guess , int randomNumber){
        if (guess == randomNumber ) {
            System.out.println("Correct");
        }else if (guess > randomNumber){
            System.out.println("Too high");
        }else{
            System.out.println("Too low");
        }
    }
    public static void main(String[] args) {
        // Repeat steps 2 and 3 until the user guesses the correct number.
        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;

        System.out.print("Enter your guesss 1 to 100 : ");

        int guess = sc.nextInt();
        int attempts = 0;
        int maxAttempts = 5;

        // checking for invalid or negative
        do {
            if (attempts >= maxAttempts) {
                System.out.println("Game Over! You've used all attempts.");
                System.out.println("The correct number was: " + randomNumber);
                break;
            }
            System.out.print("Enter your guess (1 to 100): ");
            guess = sc.nextInt();

            if (guess <= 0 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100");
                continue; 
            }
            attempts++;
            checkGuess(guess, randomNumber);
            
            System.out.println("Attempts left: " + (maxAttempts - attempts));

        } while (guess != randomNumber);

        System.out.println("You guessed the correct number: " + randomNumber);

        sc.close();
        
    }
}
