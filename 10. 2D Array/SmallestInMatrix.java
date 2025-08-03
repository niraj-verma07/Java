import java.util.Scanner;

public class SmallestInMatrix {

    public static int smallestInMatrix(int matrix[][]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(smallest> matrix[i][j]){
                    smallest = matrix[i][j];
                }
            }
        }
        return smallest;
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
    int smallest = smallestInMatrix(matrix);
    System.out.println(smallest + " is smallest Element");
    }
}
