public class HybridInheritance {
     public static void main(String[] args) {
         D obj =new D();
         obj.Display();
     }
}

// super class
class A {
    int a = 1;
}

class B extends A {
    int b = 2;

}

// interface
interface C {
    int c = 3;

}

// extend and implementation together
class D extends B implements C {
    int d = 4;
    int sum = a + b + c + d;
    void Display(){
        System.out.println("the value of a is"+a);
        System.out.println("the value of b is"+b);
        System.out.println("the value of c is"+C.c);
        System.out.println("the value of d is"+d);
        System.out.println("the sum is"+sum);
    }
}