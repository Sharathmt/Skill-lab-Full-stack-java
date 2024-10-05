import java.util.Scanner;

public class Palindrome { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a String : ");
        String input = scanner.nextLine();

        String cleanedInput = input.replaceAll("\\s+","").toLowerCase(); 
        
        if (isPalindrome(cleanedInput)) {
            System.out.println(" is a palindrom");

        }
        else{
            System.out.println("is not a palindrom");
            }
     scanner.close();
    }
    public static boolean isPalindrome(String  Str) {
        int left = 0;
        int right = Str .length() -1;

        while(left<right){
            if(Str .charAt(left) != Str.charAt(right)) {
                return false; 
            }
            left++;
            right--;

        }
        return true; 
    }
    
}
