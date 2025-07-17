//Write a program to print the multiplication table of a number N, entered by the
// user

import java.util.*;
public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter number to get multiplication table : ");

        int num = sc.nextInt();

        for(int i=1; i <= 10; i++){
            System.out.println(num + "X" + i + "=" + num*i);
        }
    }
}
