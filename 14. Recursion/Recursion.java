// Recursion numbers from n to 1 (Decreasing order)

public class Recursion {

    public static void printNum(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printNum(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);

        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        printNum(10);
        printInc(10);
    }
}
