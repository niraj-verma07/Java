import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " is a Even number");
        }else{
            System.out.println(num + " is a Odd Number");
        }
    }
}
