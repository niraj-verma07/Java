public class XpowerN {

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // int xnm1 = power(x, n-1);
        // int xn = x * xnm1;
        // return xn;

        return x * power(x, n - 1); // One liner solution

        // return (int)Math.pow(x, n); //Inbuilt function;
    }

    public static int powerOptimized(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int halfPower = powerOptimized(x, n / 2);

        // Saved on a variable to reduce time complexity beacuse if we use
        // powerOptimized(x, n / 2) two times in halfPowerSq it increase time complexity
        // to reduce that we store it in another variable and simple use them in
        // halfpowerSq

        int halfPowerSq = halfPower * halfPower;

        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq; // Multiplying x one more time if n is odd;
        }

        return halfPowerSq;
    }

    public static void main(String[] args) {
        // System.out.println(power(2, 5));
        int x = 2;
        int n = 10;
        System.out.println(powerOptimized(x, n));
    }
}
