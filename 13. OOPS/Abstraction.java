public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();;
        h.walks();

        Chicken c = new Chicken();
        c.eat();
        c.walks();
        

        Mustang m = new Mustang();

    }
}


abstract class Animal{

    String color;
    Animal(){
        System.out.println("Animal Constructor called");
    }
    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walks();  //abstract class because it gives only idea not implemantation
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        color = "dark brown";
    }
    void walks(){
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken constructor called");
    }
     void changeColor(){
        color = "Yellow";
    }
    void walks(){
        System.out.println("Walks on 2 legs");
    }
}