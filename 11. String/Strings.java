import java.util.*;

public class Strings{

    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd',};
        String str = "abcd";
        String str2 = new String("XYZ");

        // System.out.println(str);

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        //Length
        System.out.println(name.length());

        // Concatenation
        String frstName = "Niraj";
        String lstName = "Kumar";
        String fullName = frstName + " " + lstName;
        System.out.println(fullName);

        // Char At

        System.out.println(fullName.charAt(3));

        printLetters(fullName);
    }
}