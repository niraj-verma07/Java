import java.util.*;
public class Caculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.println("Enter Operator (+, -, *, /, %) : ");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+' : System.out.println(a+b);
            break;

            case '-' : System.out.println(a-b);
            break;

            case '*' : System.out.println(a*b);
            break;

            case '/' : System.out.println(a/b);
            break;

            case '%' : System.out.println(a%b);
            break;

            default : System.out.println("Wrong Input");
        }
    }
}
