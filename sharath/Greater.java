
import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the first Number");
        int n1 = sc1 . nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the second Number");
        int n2 = sc2 . nextInt();
        if(n1>n2){
            System.out.println("Given n1 is greater then n2");
        }
        else{
            System.out.println("Given n2 is greater then n1");
        }
    }
}

