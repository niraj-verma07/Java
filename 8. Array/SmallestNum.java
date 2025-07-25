import java.util.*;
public class SmallestNum {
     public static int smallestNum(int arr[]){
        int smallest = Integer.MAX_VALUE; // +Infinity

        for(int i=0; i<arr.length; i++){
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,8, 6, 58, 96};
        System.out.println("Largest value is : "+ smallestNum(arr));
    }
}
