public class SubArr {

    public static void subArr(int numbers[]){
        int totalSubArr = 0;
        int sum = 0;
        for(int i=0; i<numbers.length; i++){
            int start =i;
            for(int j=i; j< numbers.length; j++){
                int end =j;
                for(int k =start; k<=end; k++){ //Print
                    System.out.print(numbers[k] + " "); //Subarray
                    sum = sum + numbers[k];

                }
                totalSubArr++;
                
                System.out.println();
            }
            System.out.println();
            // System.out.println("Sum of Sub Arrays : " + sum);
        }
        System.out.println("Total Sub Arrays : " + totalSubArr);
        System.out.println("Total Sum of Sub Arrays : " + sum);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        subArr(numbers);
    }
}
