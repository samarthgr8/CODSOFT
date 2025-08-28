import java.util.*;//RANDOM

public class task_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int maxAttempt = 5;
        int totalRound = 0;
        int won = 0;

        System.out.println("Welcome to the Game!");

        boolean playAgain = true;
        while (playAgain) {
            int target = rd.nextInt(100) + 1; // Random number between 1 and 100
            int attempts = 0;
            boolean guessedCorrect = false;

            System.out.println("\nI have selected a number between 1 and 100.");
            System.out.println("You have " + maxAttempt + " attempts to guess it!");

            while (attempts < maxAttempt) {
                System.out.print(" Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == target) {
                    System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                    guessedCorrect = true;
                    won++;
                    break;
                } else if (guess < target) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!guessedCorrect) {
                System.out.println("You've used all attempts! The number was: " + target);
            }

            totalRound++;

            // Ask if the user wants to play again
            System.out.print("Do you want to play another round? (yes/no): ");
            sc.nextLine(); // consume leftover newline
            String response = sc.nextLine().trim().toLowerCase();

            playAgain = response.equals("yes");
        }

        // Final Score
        System.out.println("\n Game Over!");
        System.out.println("Total Rounds Played: " + totalRound);
        System.out.println("Rounds Won: " + won);
    }
}
