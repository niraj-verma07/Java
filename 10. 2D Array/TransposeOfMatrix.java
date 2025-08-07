// Write a program to find traspose of a matrix.
// What is transpose ?
// Transpose of a matrix is the process of swapping the rows to columns. For a 2x3 matrix,

// Matrix
// a11 a12 a13
// a21 a22 a23

// Transposed Matrix
// a11 a21
// a12 a22
// a1  a23

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int matrix[][] = {
            {2,3,7},
            {5,6,7}
        };
        int row =2;
        int column =3;

        //Print original Matrix
        printMatrix(matrix);

        //Transpose the matrix

        int transpose[][]= new int[column][row];

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        //Print the transposed matrix
        printMatrix(transpose);
    }

    public static void printMatrix(int matrix[][]) {
        System.out.println("The Matrix is : ");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
