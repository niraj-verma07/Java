public class SelectionSortRev {

    public static void selectionSortRev(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos =i;
            for(int j=i+1; j< arr.length; j++){
                if(arr[minPos] < arr[j]){
                    minPos =j;
                }
            }

            //Swap

            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        selectionSortRev(arr);
        printArr(arr);
    }
}
