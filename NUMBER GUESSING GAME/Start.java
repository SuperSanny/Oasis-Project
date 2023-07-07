import java.util.*;

public class Start {
    static Scanner sc;
    int min = 1;
    int max = 100;
    int maxAttempts = 10;
    int score = 0;
    public Start() {
        sc = new Scanner(System.in);
        boolean playAgain = true;
        if(playAgain == false) return;
        while (playAgain) {
            int generatedNumber = generateRandomNumnber(min, max);
            int attempts = 0;
            while (attempts < maxAttempts){
                int guessNumber = prompt(min, max);
                attempts++;
                if (attempts == generatedNumber) {
                    int points = maxAttempts - attempts + 1;
                    score += points;
                    System.out.println("Congratulations! You guessed the number.\n Attempts: " + attempts + " And Points :" + points);
                } else if (guessNumber < generatedNumber) {
                    System.out.println("Too Low! Try again");
                } else {
                    System.out.println("Too high! Try again");
                }
            }
            if (attempts == maxAttempts) {
                System.out.println("\nGave over! Your final score is "+ score);
            }
            System.out.print("\nDo you want to play again?\nClick yes/y otherwise any key: ");
            String choice = sc.next();
            choice.toLowerCase();
            if(choice.charAt(0) == 'y') {
                playAgain = true;
            }
            else {
                playAgain = false;
            }
        }
    }
    public static int generateRandomNumnber(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
    }
    public static int prompt(int min, int max){
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        return sc.nextInt();
    }
}
