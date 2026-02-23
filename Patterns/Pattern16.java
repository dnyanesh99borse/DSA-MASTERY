//HOLLOW REVERSE TRIANGLE PATTERN

class Pattern16 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = n - 1; k >= i; k--) {
                //k pehele 4 --> then k=3, k=2, k=1 and so on.. due to the above for loop
                if (i == 0 || i == k || k == n - 1) {
                    System.out.print("* "); 
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

//  * * * * * 
//   *     *
//    *   *
//     * *
//      *
