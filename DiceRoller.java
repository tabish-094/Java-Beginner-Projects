import java.util.Scanner;
import java.util.Random;
class DiceRoller {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        System.out.println("ENTER THE NO. ` OF DICE TO ROLL: ");
        int numOfDice = s.nextInt();
        int total = 0; // Initialize total to 0
        
        if (numOfDice > 0) {
            for (int i = 0; i < numOfDice; i++) {
                int roll = r.nextInt(1,7); // Generates a random number between 1 and 6
                System.out.println("You rolled: " + roll);
                
                total = total + roll;
            }   
            System.out.printf("Total: %d ", total); // Print the total after all rolls
        }
        else {
            System.out.println("Number of dice must be greater than 0.");
        }
    }    

    static void printdie(int roll) {
        String dice1 = """
             -------
            |       |
            |   *   |
            |       |
             -------
            """;

        String dice2 = """
                 -------
                | *     |
                |       |
                |     * |
                 -------
                """;
        String dice3 = """
                     -------
                    | *     |
                    |   *   |
                    |     * |
                     -------
                    """;
        
        String dice4 = """
                     -------
                    | *   * |
                    |       |
                    | *   * |
                     -------
                    """;
        String dice5 = """
                     -------
                    | *   * |
                    |   *   |
                    | *   * |
                     -------
                    """;
        String dice6 = """
                     -------
                    | *   * |
                    | *   * |
                    | *   * |
                     -------
                    """;

        switch (roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll!");
        }


    }
}
