public class Swap {
    public static void main(String[] args) {
        int a=5;
        int b = 10;
        
        System.out.println("Before the swap: a=  "+a+ ",b= "+b );
        int temp =a;
        a = b;
        b = temp;

        System.out.println("After the swap: a=  "+a+ ",b= "+b);
    }
    
}
