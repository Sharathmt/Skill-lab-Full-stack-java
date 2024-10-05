public class Bike {
  // public void Display(String Name){
  // System.out.println("Sharath " + Name);
  // }
  // public static int square(int number){
  // return number * number;
  // }
  String brand;
  int year;

  // constructor
  public Bike(String brand, int year) {
    this.brand = brand;
    this.year = year;

  }

  public void DisplayBikeInfo() {
    System.out.println("bike brand: " + brand);
    System.out.println("Manfactor: " + year);
  }

  public static void main(String[] args) {
        //instanceMethod a = new instanceMethod();
       // a.Display("hi");
       //int result = instanceMethod.square(5);
       //System.out.println("square of 5 is : "+result);
       Bike myBike = new Bike("BMW", 1995);
       myBike.DisplayBikeInfo();

    }

}
