//------this is leetcode(73) and striver's sheet question 

//for all the theoratical and better understanding of different approches to solve this question is noted in my notes
//so please do refer it.
//------------------BRUTE FORECE APPROACH-----------------------
// class Zerometrics {
//     static void setZeroes(int[][] matrix) {
//      //length of row
//      int m = matrix.length;
//      //length of column
//      int n = matrix[0].length;
//      for(int i = 0; i<m; i++){
//         for(int j = 0; j < n; j++){
//             if(matrix[i][j] == 0){
//                 //mark entire row as -1
//                 for(int col = 0; col < n; col++){
//                     if(matrix[i][col] != 0){
//                         matrix[i][col] = -1;
//                     }
//                 }
//                 //mark entire column as -1
//                 for(int row = 0; row < m; row++){
//                     if(matrix[row][j] != 0){
//                         matrix[row][j] = -1;
//                     }
//                 }
//             }
//         }
//      }
//      for(int i = 0; i < n; i++){
//         for(int j = 0; j < n; j++){
//             if(matrix[i][j] == -1){
//                 matrix[i][j] = 0;
//             }
//         }
//      }
//     }
//     public static void main(String[] args) {
//         int[][] matrix = { {1,1,1},{1,0,1},{1,1,1}};
//         setZeroes(matrix);
//         for(int i = 0; i < matrix.length; i++){
//             for(int j = 0; j < matrix.length; j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }
//--------------------BETTER APPROACH---------------------
//"now here we'll track the rows and columns to be change, using separate row and column and then later 
//we'll convert them into 1 instead of doing it on a moment."
class Zerometrics {

    static void setZeroes(int[][] matrix) {
        //length of row
        int m = matrix.length;
        //length of column
        int n = matrix[0].length;

        //creat row marker array
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        //now set the cells to 0 as per the row and col
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] == true || col[j] == true) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

        public static void main(String[] args) {
        // Create the matrix
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        
        // Call function
        setZeroes(matrix);
        
        // Print the updated matrix
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}


// public class Main {
//     public static void main(String[] args) {
//         // Create the matrix
//         int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        
//         // Create Solution object
//         Zerometrics obj = new Zerometrics();
//         // Call function
//         obj.setZeroes(matrix);
        
//         // Print the updated matrix
//         for (int[] row : matrix) {
//             for (int val : row) {
//                 System.out.print(val + " ");
//             }
//             System.out.println();
//         }
//     }
// }
