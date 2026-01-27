//--this is leetcode's 118.PASCAL'S TRIANGLE question

//1. General Brute force Approach
// LeetCode 118: Pascal's Triangle
// class Pascals {
//     static void PascalsTriangle(int n) {
//         int[] prevRow = null;   // to store previous row
//         for (int i = 0; i < n; i++) {
//             int[] row = new int[i + 1];
//             for (int j = 0; j <= i; j++) {
//                 if (j == 0 || j == i) {
//                     row[j] = 1;
//                 } else {                                   //simple logic
//                     row[j] = prevRow[j - 1] + prevRow[j]; //jya cell var present made ahet tyacha varchya row madhun tyachya varcha ani tyachya left sidecha.
//                 }
//             }
//             // print row
//             for (int val : row) {
//                 System.out.print(val + " ");
//             }
//             System.out.println();
//             prevRow = row;   // update previous row
//         }
//     }
//     public static void main(String[] args) {
//         PascalsTriangle(5);
//     }
// }
//===========OPTIMIAL APPROACH===========
class Pascals {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {
            int val = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(val + " ");
                val = val * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
