import java.util.*;

public class LargestInMatrix {

    public static void largestInMatrix(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length;j++){
                if(largest < matrix[i][j]){
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println(largest + " is largest Element");
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
    int n = matrix.length, m = matrix[0].length;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Matrix Elements : ");
    for(int i=0; i< n; i++){
        for(int j=0; j<m; j++){
            matrix[i][j] = sc.nextInt();
        }
    }
    //Output
    System.out.println("Matrix : ");

    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
    largestInMatrix(matrix);
    }

    
    
}
