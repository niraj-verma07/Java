import java.util.*;
public class IncomeTaxCaculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Income in Lakhs");
            double income = sc.nextDouble();
            double tax;
        if(income < 5){
            System.out.println("You have to pay 0 rupess tax");
        }else if(income >= 5 && income < 10){
            tax = income * (0.2);
                System.out.println("Tax Amount = " + tax + " Lakhs");
        }else{
            tax = income * (0.3);
            System.out.println("Tax Amount = " + tax + " Lakhs");
        }
    }
}
