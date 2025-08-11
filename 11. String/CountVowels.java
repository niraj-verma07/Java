//Count how many times lowercase vowels occurred in a String entered by the user.

import java.util.*;
public class CountVowels {

    public static void countLowerVowels(){
       System.out.println("Enter Vowels : "); 
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       int count =0;

       for(int i=0; i<str.length(); i++){
        //Find each characters form the str entered by the user
        char ch = str.charAt(i);

        //Checks the conditions for lowecase vowels
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            count++;
        }
       }
       System.out.println("Count of vowels are : "+count);
    }
    public static void main(String[] args) {
        countLowerVowels();
    }
}
