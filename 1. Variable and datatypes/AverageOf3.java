//In a program, input 3 numbers : A, B and C. You have to output the average of
// these 3 numbers.

import java.util.*;
public class AverageOf3{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int avg = (num1 + num2 + num3) / 3;
        System.out.println("Average is : " + avg);

    }
}