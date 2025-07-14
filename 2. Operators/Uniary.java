public class Uniary{
    public static void main(String args[]){
        int a = 20;
        int b = a++;  // use then change
        System.out.println(a); // 21
        System.out.println(b); // 20 returns 20 because java creates it space in memory before exection and updation of and a and store the old value of a

        int c = 30;
        int d = ++c; // change then use
        System.out.println(c); //31
        System.out.println(d); //31
    }
}