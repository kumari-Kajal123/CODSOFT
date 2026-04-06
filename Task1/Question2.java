import java.util.*;

public class Question2 {
    public static void main(String[] args) {

        // Prompt the user to enter their guess for the generated number.
        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;

        System.out.print("Enter your guesss 1 to 100 : ");

        int guess = sc.nextInt();

        // checking for invalid or negative
        if (guess <= 0 || guess > 100) {
            System.out.println("Please enter a number between 1 and 100");
        } else {
            System.out.println("You guessed: " + guess);
            System.out.println("Computer guess: " + randomNumber);
        }

        sc.close();
    }
}
