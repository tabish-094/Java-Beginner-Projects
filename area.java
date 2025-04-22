import java.util.Scanner;

class area {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");
        double length = s.nextDouble();
        
        System.out.println("Enter the width of the rectangle: ");
        double width = s.nextDouble();
        
        double area = length * width;
        
        System.out.println("The area of the rectangle is: " + area);
        
        s.close();
    }
}
