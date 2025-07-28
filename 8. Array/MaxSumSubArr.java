import java.util.*;

public class MaxSumSubArr{

    //Not Optimized and bad time complexity


    // public static void maxSubArrSum(int numbers[]){
    //     int currSum = 0;
    //     int maxSum = Integer.MIN_VALUE;
    //     for(int i=0; i<numbers.length; i++){
    //         int start =i;
    //         for(int j=i; j< numbers.length; j++){
    //             int end =j;
    //             currSum=0;
    //             for(int k =start; k<=end; k++){ //Print
    //                 // Subarray Sum
    //                 currSum += numbers[k];
    //             }
    //             System.out.println(" Current sum : "+currSum);
    //             if(maxSum < currSum){
    //                 maxSum = currSum;
    //             }
    //         }
            
    //     }
    //     System.out.println("Max sum : " +maxSum);
        
    // }

    //Optimzed

    // public static void maxSubArrSum(int numbers[]){
    //     int currSum =0;
    //     int maxSum = Integer.MIN_VALUE;
    //     int prefix[] = new int[numbers.length];

    //     // Calculate prefix array
    //     prefix[0] = numbers[0];
    //     for(int i=1; i< prefix.length; i++){
    //         prefix[i] = prefix[i-1] + numbers[i];
    //     }

    //     for(int i=0; i<numbers.length; i++){
    //         int start =i;
    //         for(int j=i; j< numbers.length; j++){
    //             int end =j;
    //             currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

    //             if(maxSum < currSum){
    //                 maxSum = currSum;
    //             }
    //         }
    //     }
        
    //     System.out.println("Sum : " +maxSum);
        
    // }

    public static void kadans(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i< numbers.length; i++){
            currSum = currSum+numbers[i];

            // maxSum = Math.max(currSum, maxSum); writting here will be best approuch for all negative numbers array
            if(currSum < 0){
                currSum = 0;
            } 

            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Max Sum of subarray : " + maxSum);
    }

    public static void main(String[] args) {
        // int numbers[] = {2,4,6,8,10};
        // maxSubArrSum(numbers);

        // int numbers[] = {1,-1, 6, -1, 3};
        // maxSubArrSum(numbers);

        int numbers[] = {-2,-3,4, -1, -2, 1, 5, -3};
        kadans(numbers);
    }
}
