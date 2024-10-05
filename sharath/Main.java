//one class inherit from another class
class Bird {
    void fly() {

        System.out.println("bird can fly");
    }
}

class Parrot extends Bird {
    void color() {
        System.out.println("i am green");
    }
}

// inheriting class parrot
// class singleParrot extends Parrot {
// void sing() {
// System.out.println("i can sing");
// }
// }
class cow extends Bird {
    void whatcoloriam() {
        System.out.println("i am black");
    }
}

public class Main {
    public static void main(String[] args) {
        Parrot P = new Parrot();
        cow s = new cow();
        // P.sing();
        P.color();
        P.fly();
        s.whatcoloriam();
    }
}