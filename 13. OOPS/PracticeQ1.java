public class PracticeQ1 {

    // Find out the correct statement to assign name to object
    public static void main(String[] args) {
        Student s = new Student();
        // Fill here
        s.name = "Niraj"; // Ans
    }
}

class Student {
    String name;
    int marks;
}

// Options :
// a. s->name = "niraj"
// b. Student.name = "niraj";
// c. s.name = "Niraj"