import java.util.*;

public class InbuiltSort{
    //Print Array
     public static void printArr(int arr[]){
    //  public static void printArr(Integer arr[]){
        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        // Integer arr[] = {5, 4, 1, 3, 2};
        Arrays.sort(arr);
        Arrays.sort(arr);
        // Arrays.sort(arr, Collections.reverseOrder());  // We have to make the datatypes to objects to use reverseOrder function it doest not works on primitive datatypes
        
        // Arrays.sort(arr, 0, 3);  //from index 0 to index 2 element will be sorted and remaining will not sorted  
        printArr(arr);
    }
} 