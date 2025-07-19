import java.util.*;
public class Param {

//     public static void calculateSum(int num1, int num2){
//         int sum = num1+num2;
//         System.out.println("Sum is " + sum);
//     }
//    public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();

// calculateSum(a, b);
//    } 
 
 public static int calculateSum(int num1, int num2){
        int sum = num1+num2;
        return sum;
       
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum2 = calculateSum(a, b);
    System.out.println("Sum is " + sum2);
   } 
}
