
import java.util.Scanner;

public class Simple {
    public static double  Simple (double principal,double rate,double time) {
        double ratedecimal = rate/100;
        return principal * ratedecimal *time ;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal amount");
        double principal = scanner.nextDouble();
        System.out.println("Enter the rate of interest in( % ) ");
        double rate = scanner.nextDouble();
        System.out.println("Enter the time taken in years");
        double time= scanner.nextDouble();
        double SimpleInterset = Simple(principal,rate,time) ;
        System.out.printf("SimpleInterest: $%.2f%n", SimpleInterset);
        scanner.close();
    }
    
}
