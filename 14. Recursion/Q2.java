//You are given a number (eg - 2019) convert it into String of english like "two zeros one nine". use a recursive function to solve this problem.
// NOTE : The digit of the number will only be in the range 0-9 and the last digit of a number can't be 0.

// Input : 1947
// Output : "One nine four seven"
public class Q2 {
    static String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void printDigit(int number) {
        if (number == 0) {
            return;
        }
        int lastDigit = number % 10;
        printDigit(number / 10);
        System.out.print(digits[lastDigit] + " ");
    }

    public static void main(String[] args) {
        printDigit(1234);
    }
}
