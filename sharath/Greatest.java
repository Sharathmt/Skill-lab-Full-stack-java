import java.util.Scanner;
public class Greatest {
        public static void main(String[] args) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter the first Number");
            int n1 = sc1 . nextInt();
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Enter the second Number");
            int n2 = sc2 . nextInt();
            Scanner sc3 = new Scanner(System.in);
            System.out.println("Enter the Third Number");
            int n3 = sc3 . nextInt();
            if(n1>n2&&n1>n3){
                System.out.println("Given n1 is greater" +n1);
            }
            else if(n2>n1&&n2>n3){
                System.out.println("Given n2 is greater" +n2);
            }
            else{
                System.out.println("Given n3 is greater"+n3);
            }
        }
    }
    
    

