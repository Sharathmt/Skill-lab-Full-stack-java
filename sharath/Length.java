
import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a string: ");
        String inputString = s.nextLine();

        int length = inputString.length();

        System.out.println("the length of the entered string is "+ length);
    }
    
}
