public class Fibonacci {
    // calculate nth term in fibonacci
    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int fibNm1 = fibo(n - 1);
        int fibNm2 = fibo(n - 2);
        int fibN = fibNm1 + fibNm2;

        return fibN;
    }

    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
}
