
import java.util.Arrays;

public class SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // Step 1: Create a copy of the matrix
        int[][] copy = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                copy[i][j] = matrix[i][j];
            }
        }

        // Step 2: Find zeros in original matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {

                    // Set entire row to zero
                    for (int col = 0; col < m; col++) {
                        copy[i][col] = 0;
                    }

                    // Set entire column to zero
                    for (int row = 0; row < n; row++) {
                        copy[row][j] = 0;
                    }
                }
            }
        }

        // Step 3: Copy back to original matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = copy[i][j];
            }
        }
    }

    // Helper method to print matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Main method (entry point)
    public static void main(String[] args) {
        SetMatrixZeroes solution = new SetMatrixZeroes();

        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        solution.setZeroes(matrix);

        System.out.println("\nMatrix After Setting Zeroes:");
        printMatrix(matrix);
    }
}










// import java.util.Arrays;

// public class SetMatrixZeroes {

//     public void setZeroes(int[][] matrix) {
//         int n = matrix.length;
//         int m = matrix[0].length;

//         // Step 1: Create a copy of the matrix
//         int[][] copy = new int[n][m];

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 copy[i][j] = matrix[i][j];
//             }
//         }

//         // Step 2: Find zeros in original matrix
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 if (matrix[i][j] == 0) {

//                     // Set entire row to zero
//                     for (int col = 0; col < m; col++) {
//                         copy[i][col] = 0;
//                     }

//                     // Set entire column to zero
//                     for (int row = 0; row < n; row++) {
//                         copy[row][j] = 0;
//                     }
//                 }
//             }
//         }

//         // Step 3: Copy back to original matrix
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 matrix[i][j] = copy[i][j];
//             }
//         }
//     }

//     // Helper method to print matrix
//     public static void printMatrix(int[][] matrix) {
//         for (int[] row : matrix) {
//             System.out.println(Arrays.toString(row));
//         }
//     }

//     // Main method (entry point)
//     public static void main(String[] args) {
//         SetMatrixZeroes solution = new SetMatrixZeroes();

//         int[][] matrix = {
//             {1, 1, 1},
//             {1, 0, 1},
//             {1, 1, 1}
//         };

//         System.out.println("Original Matrix:");
//         printMatrix(matrix);

//         solution.setZeroes(matrix);

//         System.out.println("\nMatrix After Setting Zeroes:");
//         printMatrix(matrix);
//     }
// }
