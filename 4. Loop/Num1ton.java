import java.util.*;

public class Num1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int i = 1;
        while(i <= num){
            System.out.println(i);
            i++;
        }
    }
}
