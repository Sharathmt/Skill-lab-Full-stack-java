
import java.util.Scanner;
public class Index {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter the world");
            String str = sc1 . nextLine();

            System.out.println("enter a character to find: ");
            char ch = sc1.next().charAt(0);

            int index = str . indexOf(ch);
            if(index != -1){
                System.out.println("The character ' "+ch+"'is found at index: "+index );
            }
            else{
                System.out.println("The character ' "+ch+"'is not found at index: "+index );
            }
            sc1.close();
    }
    
}
