import java.util.Random;
import java.util.Scanner;

public class Question3 {
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
        // Compare the user's guess with the generated number and provide feedback on whether the guess 
        // is correct, too high, or too low.
        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;

        System.out.print("Enter your guesss 1 to 100 : ");

        int guess = sc.nextInt();

        // checking for invalid or negative
        if (guess <= 0 || guess > 100) {
            System.out.println("Please enter a number between 1 and 100");
        } else {
            checkGuess( guess ,randomNumber);
            System.out.println("You guessed: " + guess);
            System.out.println("Computer guess: " + randomNumber);
        }

        sc.close();
        
    }
}
