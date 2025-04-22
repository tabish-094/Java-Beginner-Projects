import java.util.Scanner;

class quizGameProject {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int score = 0; // Initialize score
        System.out.println("Welcome to the Quiz Game!");
        System.out.println("You will be asked a series of questions.");
        System.out.println("Answer them correctly to win!");

        String[] questions = {
            "What is the capital of France?",
            "What is 2 + 2?",
            "What is the largest planet in our solar system?",
            "Who wrote 'Romeo and Juliet'?",
            "What is the chemical symbol for gold?"
        };

        String[][] options = {
            {"A. Paris", "B. London", "C. Berlin", "D. Madrid"},
            {"A. 3", "B. 4", "C. 5", "D. 6"},
            {"A. Earth", "B. Mars", "C. Jupiter", "D. Saturn"},
            {"A. Shakespeare", "B. Dickens", "C. Austen", "D. Twain"},
            {"A. Au", "B. Ag", "C. Pb", "D. Fe"}
        };

        int answers[] = {0, 1, 2, 0, 0}; // Index of correct answers

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.println("Enter your answer (A, B, C, or D): ");
            char guess = s.next().toUpperCase().charAt(0); // Properly handle character input

            // Map 'A', 'B', 'C', 'D' to 0, 1, 2, 3
            int guessIndex = guess - 'A';

            if (guessIndex == answers[i]) {
                System.out.println("Correct!");
                score++; // Increment score for correct answer
            } else {
                System.out.println("Wrong! The correct answer is " + options[i][answers[i]]);
            }

            System.out.println(); // Print a blank line for better readability
        }

        System.out.println("YOUR FINAL SCORE IS : " + score + "/" + questions.length);
        s.close(); // Close the scanner resource
    }
}