import java.util.Scanner;
class WeightConversion {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        
        System.out.println("WEIGHT CONVERSION PROGRAM");
        
        System.out.println("1. Convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs");

        System.out.println("Choose an Option: ");
        choice = s.nextInt();

        if (choice==1) {
            System.out.println("Enter weight in lbs: ");
            weight = s.nextDouble();
            newWeight = weight * 0.45359237;
            System.out.printf("Weight in kgs: %.2f ", newWeight);

        }
        else if (choice==2) {
            System.out.println("Enter weight in kgs: ");
            weight = s.nextDouble();
            newWeight = weight * 2.2046226218;
            // 1 kg = 2.2046226218 lbs
            System.out.printf("Weight in lbs: %.2f ", newWeight);

        }
        else {
            System.out.println("Invalid choice. Please select 1 or 2.");
        }
        
        s.close();
    }
    
}
