import java.util.Scanner;
class compinterest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double principal; // Initial amount
        double rate; // Interest rate (in percentage)
        int time;
        int years;

        System.out.println("ENTER THE PRINCIPAL AMOUNT : ");
        principal = s.nextDouble();

        System.out.println("ENTER THE RATE OF INTEREST : ");
        rate = s.nextDouble();

        System.out.println("ENTER THE TIME PERIOD COMPOUNDED PER YEAR : ");
        time = s.nextInt();

        System.out.println("ENTER THE TIME PERIOD IN YEARS : ");
        years = s.nextInt();


        
        double amount = principal * Math.pow(1 + rate / time, time * years);
        

        System.out.println("The amount after " + years + " years is: " + amount);

        s.close();
    }
    
}
