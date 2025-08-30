public class SumOfN {

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }

        int sum = n + sum(n - 1);

        return sum;
    }

    // 2nd Approuch
    public static int sumN(int n) {
        if (n == 1) {
            return 1;
        }

        int Snm1 = sumN(n - 1);
        int Sn = n + Snm1;

        return Sn;
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(sumN(5));

    }
}
