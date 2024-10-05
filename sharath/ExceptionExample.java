public class ExceptionExample {
    public static void main(String[] args) {
        try {
            //risky code that may handle cause an exception
            int a =  10/0;//this will throw arithmeticException
            System.out.println("Result: "+a);
        } catch (ArithmeticException e) {
            //handle the exception
            System.out.println("Error Division by Zero ");
        }
        finally{
            //code that always executs
            System.out.println("This is finally block");
        }
        System.out.println("Rest of the Code");

    }
    
}
