abstract  class Animal {
  public abstract void sound();
  public void sleep()
        {
        System.out.println("the animal is sleeping");

    }
}
class Dog extends Animal {
    public void sound(){
        System.out.println("the dog barks");
    }

}

class cat extends Animal{
    public void sound(){
        System.out.println("cat meow");
    }
}
public  class Abstract{
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal mycat = new cat();

        myDog.sound();
        mycat.sound();

        myDog.sleep();
        mycat.sleep();

    }

}

