//Write to find the first occurence of an element in an array

public class FirstOccurence {

    public static int firstOcc(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return firstOcc(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        int key = 15;
        int i = 0;
        System.out.println(firstOcc(arr, key, i));
    }
}
