import java.util.*;

public class BitManipulation{
    public static void main(String args[]){
        System.out.println("AND : "+ (5&6));
        System.out.println("OR : " + (5|6));
        System.out.println("XOR : " + (5 ^ 6));
        System.out.println("One's Complement : " + (~5));
        //-6 Because of 2's complement 
        System.out.println("Left Shift : " + (5 << 2));
        System.out.println("Right Shift : " + (6 >> 1));
    }
}