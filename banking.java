import java.util.Scanner;

class banking {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        double balance = 0.0;
        boolean isRunning = true;
        int choice;

        while(isRunning){
            System.out.println("Welcome to the Banking Application!");
            System.out.println("Please choose an option:");
            System.out.println("===================================");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = s.nextInt();




            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: $" + balance);
                    break;
                case 2:
                    balance += depositMoney();
                    break;
                case 3:
                    balance -= Withdraw(balance);
                    break;
                case 4:
                    System.out.println("Exiting the application. Thank you!");
                    isRunning = false;
                    break;
                default:
                System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
            
        
    }
    static void showBalance(double balance) {
        System.out.println("Your current balance is: $" + balance);
    }

    static double depositMoney() {
        System.out.print("Enter the amount to deposit: ");
        double amount = s.nextDouble();
        
        if (amount < 0) {
            System.out.println("Amount cant be negative");
            return 0;
        }
        else{
            System.out.println("Deposited: $" + amount);
            return amount;
        }
    }

    static double Withdraw(double balance) {
        System.out.print("Enter the amount to withdraw: ");
        double amount = s.nextDouble();
        
        if (amount < 0) {
            System.out.println("Amount cant be negative");
            return 0;
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Cannot withdraw more than the current balance.");
            return 0;
        } else {
            System.out.println("Withdrawn: $" + amount);
            return amount;
        }
    }

    
}


