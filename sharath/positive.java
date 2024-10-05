
import java.util.Scanner;

public class positive{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("enter a number");
        num = scanner.nextInt();
        if(num>0){
            System.out.println("positive number");
        }
        else{
            System.out.println("Not positive number");
        }
    }
}