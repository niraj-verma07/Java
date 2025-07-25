import java.util.*;
public class LargestNum {
    
    public static int largestNum(int arr[]){
        int largest = Integer.MIN_VALUE; // -Infinity

        for(int i=0; i<arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,8, 6, 58, 96};
        System.out.println("Largest value is : "+largestNum(arr));
    }
}
