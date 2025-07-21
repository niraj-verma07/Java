public class Palindrome {

    public static boolean isPalindrome(int num){
        int palindrome = num;
        int reverse = 0;

        while(palindrome != 0){
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if(num == reverse){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
    }
}
