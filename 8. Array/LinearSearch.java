public class LinearSearch {

    public static int linearSearch(int num[], int key){
        for(int i=0; i<num.length; i++){
            if(num[i] == key){
                return i; // Return the index of the found element
            }
        }
        return -1; // Return -1 if the element is not found
    }
    public static void main(String[] args) {
         int num[] = {10, 20, 30, 40, 50};
         int key = 30;  
        int result = linearSearch(num, key);
        if(result == -1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
