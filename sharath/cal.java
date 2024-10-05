import java.util.Scanner;
public class cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1 = sc.nextDouble();

        System.out.println("Enter the Second number");
        double num2 = sc.nextDouble();

        System.out.println("choose a operation (+,-,%,/,*): ");
        char opertion = sc.next().charAt(0);

        double result;

        switch(opertion){
            
            case '+':
            result = num1 + num2;
            System.out.println("result: "+result);
            break;

            case '-':
            result = num1 - num2;
            System.out.println("result: "+result);
            break;

            case '%':
            result = num1 % num2;
            System.out.println("result: "+result);
            break;

            case '/':
            result = num1 / num2;
            System.out.println("result: "+result);
            break;

            case '*':
            result = num1 * num2;
            System.out.println("result: "+result);
            break;
        default:
            System.out.println("invalid entery");
        }

    }
    
}
