public class StaticKey {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.schoolName = "Niraj";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "ABC";

        System.out.println(s3.getPercentage(100, 85, 98));
    }
}

class Student {
    String name;
    int roll;

    static String schoolName;

    static int getPercentage(int eng, int math, int sci) {
        return (eng + math + sci) / 3;
    }

    void getName(String name) {
        this.name = name;
    }

    String setName(String name) {
        return this.name;
    }
}