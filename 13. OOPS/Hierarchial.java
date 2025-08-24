public class Hierarchial {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        
    }
}

// Base Class (Parent)
class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathe");
    }
}


class Mammal extends Animal {
    void walks() {
        System.out.println("Walks");
    }
}

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims in water");
    }

}

class Birds extends Animal {
    void fly() {
        System.out.println("fly");
    }
}