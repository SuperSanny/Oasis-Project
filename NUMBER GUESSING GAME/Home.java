import java.util.*;

public class Home {
    public static void main(String[] args) {
        System.out.println("****=== WELCOME TO NUMBER GUESSING GAME ===***\n");

        boolean loop = true;
        while(loop) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Choose Option : \n1. Start Game\n2. Instructions \n3. Exit");
            System.out.print("Choose : ");
            int choice = scan.nextInt();
            switch(choice) {
                case 1:
                    Start start = new Start();
                    break;
                case 2:
                    System.out.println("This game is a simple number guessing game where a user is supposed to guess a number between 0 and 100 in a maximum of 10 attempts.\n " +
                            "The game will end after 10 attempts and if the player failed to guess the number, and then he loses the game.");
                    System.out.println("Enter any key to go to back.");
                    String back = scan.next();
                    break;
                case 3:
                    System.out.println("Thank You. Have a great day!");
                    return;
                default:
                    System.out.println("Invalid choice, Please try again");
                    break;
            }
        }
    }
}
