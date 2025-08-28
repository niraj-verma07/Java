public class PracticeQ2 {
    public static void main(String[] args) {

    }
}

// Which variables can the class Person access in the follwing code?

class Person {
    String name;
    int weight;
}

// Ans:
// a. name and b. weight

// For Student class all 4 options willbw correct

class Student extends Person {
    int rollNumber;
    String schoolName;
}

// Options:
// a. name
// b. weight
// c. rollNumber
// d. schoolName
