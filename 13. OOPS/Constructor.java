public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Niraj");
        // System.out.println(s1.name);

        Student s2 = new Student();
        Student s3 = new Student(123);
    }
}

class Student{
    String name;
    int roll;

    //Non Parameterized Constructor
    Student(){
        System.out.println("Constructor is called");
    }

    //Parameterized Constructor
    Student(String name){
        this.name = name;
    }

    Student(int roll){
        this.roll = roll;
    }
}