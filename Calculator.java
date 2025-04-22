import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double num1, num2, result;
        char operator;
        boolean validOperator = true;

        System.out.println("Enter first number: ");
        num1 = s.nextDouble();

        System.out.println("Enter the Operator (+, -, *, /, ^): ");
        operator = s.next().charAt(0);

        System.out.println("Enter second number: ");
        num2 = s.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            case '^':
                result = Math.pow(num1, num2);
                System.out.println("Result: " + result);
                break;

            
            default:
                System.out.println("Invalid operator. Please use +, -, *, /, or ^.");
                validOperator = false;
                break;
                
        }       

        s.close();
    }
    
}
