public class SumOfDigit {

    public static int sumDigits(int n){
        int sumOfDigits = 0;
        while(n > 0){
            int lastDigit = n % 10;
            sumOfDigits += lastDigit;
            n /= 10;
        }
        return sumOfDigits;
    }
    public static void main(String[] args) {
        System.out.println(sumDigits(105689));
    }
}
