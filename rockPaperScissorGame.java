import java.util.Random;
import java.util.Scanner;

class rockPaperScissorGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";
        
        System.out.println("Welcome to Rock, Paper, Scissors Game!");
        System.out.println("You will play against the computer.");

        do {
            System.out.println("Enter your choice (Rock, Paper, Scissors): ");
            playerChoice = s.nextLine().toLowerCase();
    
            if (!playerChoice.equals("rock") && 
                !playerChoice.equals("paper") && 
                !playerChoice.equals("scissors")) {
    
                System.out.println("Invalid choice! Please enter Rock, Paper, or Scissors.");
                continue;
            }
    
            computerChoice = choices[r.nextInt(3)].toLowerCase();
            System.out.println("Computer chose: " + computerChoice);
    
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
    
            }
            else if (playerChoice.equals("rock") && computerChoice.equals("scissors") ||
                     playerChoice.equals("paper") && computerChoice.equals("rock") ||
                     playerChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("You win!");
    
            } else {
                System.out.println("You lose!");
                
            }
    
            System.out.println("Do you want to play again? (yes/no)");
            playAgain = s.nextLine().toLowerCase();
    
        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing!");
        

    }
}
