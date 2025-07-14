import java.util.*;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum = 0;
        int first = 1;
        while(first <= num){
            sum = sum + first;
             first ++;
        }

        System.out.println("Sum = " + sum);
    }
}0