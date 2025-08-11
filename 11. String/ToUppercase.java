import java.util.*;
public class ToUppercase {

    public static String toUppercase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        // i = 1 because for index 0 the character already checked
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i)); // Append the space and increse the i
                i++;
                // Chnage into uppercase the letter which comes after space only one letter
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();   //change the sb into string and return because StringBuilder class donot return string, so we have to make it string ourself
    }
    public static void main(String[] args) {
        String str = "hi, i am niraj";
        System.out.println(toUppercase(str));
    }
}
