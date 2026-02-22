//SQUARE HOLLOW PATTERN

class Pattern10 {

    public static void main(String[] args) {
        int n = 6;
        //for total 6 rows
        for (int i = 0; i < n; i++) {
            //to print full first and last row
            if (i == 0 || i == (n - 1)) {
                for (int j = 0; j < n-1; j++) {
                    System.out.print("* ");
                }
            } else {
                //else for all print one only star (left column first)
                for (int j = 0; j < 1; j++) {
                    System.out.print("* ");
                }
                //else while k != n-2 (cause 2 columns are not including) 
                //if last column then print "*" else print space.
                for (int k = 1; k < n-1; k++) {
                    if (k != n-2) {
                        System.out.print("  ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            //new line after each row
            System.out.println();
        }
    }
}


// * * * * * 
// *       *
// *       *
// *       *
// *       *
// * * * * *
