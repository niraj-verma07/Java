//Determine if 2 stringd are anagrams of each other.
//What are anagrams?
// If two strings contain the same characters but in different order, they can be said to be anagrams. 
// For Example race and care

import java.util.*;
public class AnagramString {
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";

        //Convert strings to lowecase so we do not have to check seprately for lowercase and uppercase

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //Check the length of both strings

        if(str1.length() == str2.length()){
            //Convert strings into char array
            char[] str1charArr = str1.toCharArray();
            char[] str2charArr = str2.toCharArray();

            //Sort the char array
            Arrays.sort(str1charArr);
            Arrays.sort(str2charArr);

            //If both sorted arrays are same the they are anagram
            boolean result = Arrays.equals(str1charArr, str2charArr);
            if(result){
                System.out.println(str1 + " and " + str2 + " are anagrams of each other");
            }else{
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
            }
        }else{
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
        }
    }
}
