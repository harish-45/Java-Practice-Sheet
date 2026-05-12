/*
C.	Creates a 2D array (matrix) of size 3x3 filled with random values between 1 and 50.
●	Prints the matrix in a formatted way.
●	Finds and prints the sum of each row and each column of the matrix.
 */
package ques3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int size = 3;

        int[][] matrix = new int[size][size];

        for (int rows[] : matrix) {
            for (int j = 0; j < rows.length; j++) {
                rows[j] = (int) (Math.random() * 100) / 2;
            }
        }

        // Matrix 
        System.out.println("\n==== Matrix ====\n");
        
        for (int rows[] : matrix) {
            System.out.println(Arrays.toString(rows));
        }

        // sum Row wise
        System.out.println("\n==== Sum of each Rows ====\n");
        
        for (int rows[] : matrix) {
            int sumRow = 0;
            for (int n : rows) {
                sumRow += n;
            }

            System.out.println("sum of row :-> " + sumRow);
        }


        // sum column wise
        System.out.println("\n==== Sum of each column ====\n");
        
        for (int i = 0; i < matrix.length; i++) {
            int sumColumn = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sumColumn += matrix[j][i];
            }

            System.out.println("sum of col :-> " + sumColumn);
        }
    }
}
