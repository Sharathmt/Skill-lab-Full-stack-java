
import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string");
        String input = scanner.nextLine();
        String reversedString = reverse(input);
        System.out.println("reversed string :" + reversedString);
        scanner.close();
    }
    public static String reverse(String Str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = Str.length() -1; i >= 0; i--){
            reversed.append(Str.charAt(i));
        }
        return reversed.toString();
    }
    
}
