package Week_02.Matrix_Transpose;

// this program allows you to find transpose of the matrix you enter

import java.util.Scanner;
import java.util.Arrays;

public class Matrix_Transpose {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Row number of matrix : ");           // rows of matrix
        int k;
        k = input.nextInt();
        System.out.println("Column number of matrix : ");        // columns of matrix
        int m;
        m = input.nextInt();

        int[][] matrix = new int[k][m];

        System.out.println("Enter matrix elements : ");          // here we create our matrix with values entered
        for (int row = 0; row < k; row++) {
            for (int column = 0; column < m; column++) {
                int n = input.nextInt();
                matrix[row][column] = n;

            }

        }

        System.out.println("First look of our matrix : ");      // first look of our matrix
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[][] transpose_matrix = new int[m][k];               // we define a new matrix to fill up with values of matrix above


        for (int i = 0; i < m; i++) {                          // simply if we change the rows and columns of the matrix we find transpose of it
            for (int j = 0; j < k; j++) {
                transpose_matrix[i][j] = matrix[j][i];
            }
        }

        System.out.println("Transpose of the matrix : ");      // we print here transpose of the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(transpose_matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}
