import java.util.*;
public class Product {

    public static int multiply
    (int a, int b){
        int product = a * b;
        return product;
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 =sc.nextInt();
    int num2 = sc.nextInt();

    int product = multiply(num1, num2);
    System.out.println("Product is " + product);
  }  
}
