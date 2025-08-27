public class Abstraction {
    public static void main(String[] args) {

        // Abstract Class
        // Horse h = new Horse();
        // h.eat();
        // ;
        // h.walks();

        // Chicken c = new Chicken();
        // c.eat();
        // c.walks();

        // Mustang m = new Mustang();

        //interfaces

        Queen q = new Queen();
        q.moves();

        Bear b = new Bear();
        b.eat();
        b.teeth();
    }
}

// Abstract Class
abstract class Animal {

    String color;

    Animal() {
        System.out.println("Animal Constructor called");
    }

    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walks(); // abstract class because it gives only idea not implemantation
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called");
    }

    void changeColor() {
        color = "dark brown";
    }

    void walks() {
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal {
    Chicken() {
        System.out.println("Chicken constructor called");
    }

    void changeColor() {
        color = "Yellow";
    } 

    void walks() {
        System.out.println("Walks on 2 legs");
    }
}

// Interfaces

interface  ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal (in 4 directons)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal (by 1 steps)");
    }
}

//Multilevel Inheritance

interface Herbivores{
    void eat();
}

interface Carnivores{
    void teeth();
}

class Bear implements Herbivores, Carnivores{
    public void eat(){
        System.out.println("Eats plants");
    }

    public void teeth(){
        System.out.println("Have sharp teeth");
    }
}