// In a program, input the side of a square. You have to output the area of the
// square.

import java.util.*;

public class AreaSq{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);

        int side = sc.nextInt();
        int area = side*side;
        System.out.println("Area : " + area);
    }
}