class polmorphism1 {
    public int add ( int a, int b){
        return a+b;
    }
    //overload method for add 3 integers
    public int add (int a, int b,int c) {
        return a+b+c;
        
    }
    //overload method for add 2 doubles
    public double add(double a,double b){
        return a+b;
    }
public class Polmorphism{
        public static void main(String[] args) {
            polmorphism1 p = new polmorphism1();
            System.out.println("sum of the integers" + p.add(10,20));
            System.out.println("sum of the integers" + p.add(10,20,30));
            System.out.println("sum of the integers" + p.add(10,20.5));
        }
    }
}
