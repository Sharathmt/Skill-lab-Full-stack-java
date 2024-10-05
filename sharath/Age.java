import java.util.Scanner;
 public class Age {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the age");
        int n1 = sc1.nextInt();
        if(n1>=18){
        System.out.println("They can vote");
        }
        else{
            System.out.println("They can't vote");
        }
    }
    
}
