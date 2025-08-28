//What will be output of this code? (both classes in same package)

public class PracticeQ6 {
    public static void main(String[] args) {

        Vechile obj1 = new Car();
        // obj1.print1();
        // Error (cannot access print1())

        Vechile obj2 = new Vechile();
        obj2.print();

    }
}

class Vechile {
    void print() {
        System.out.println("Base class(Vechile)");
    }

}

class Car extends Vechile {
    void print1() {
        System.out.println("Derived class(Car)");
    }
}

// Q7. Which of the follwing is not an OOPS component?
// a. Inheritance
// b. Encapsulation
// c. Polymorphism
// d. Aggregation

// Ans :
// d. Aggregation (nested class is called aggregation)