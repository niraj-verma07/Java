//What will be output of this code? (both classes in same package)

public class PracticeQ5 {
    public static void main(String[] args) {
        Vechile obj1 = new Car();
        obj1.print();

        Vechile obj2 = new Vechile();
        obj2.print();
    }
}

// Ans :
// Derived class(Car)
// Base class(Vechile)

class Vechile {
    void print() {
        System.out.println("Base class(Vechile)");
    }

}

class Car extends Vechile {
    void print() {
        System.out.println("Derived class(Car)");
    }
}