class Polymor{
    public static void main(String[] args) {
        //Method overloading
        Calculator cal = new Calculator();
        System.out.println(cal.sum(10,20));
        System.out.println(cal.sum((float)1.5,(float)2.5));
        System.out.println(cal.sum(10,20,30));

        //Method overriding

        Deer d = new Deer();
        d.eat();
    }
}

//Method overloading
class Calculator{
    int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}

//Method overriding

class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Eats grass");
    }
}