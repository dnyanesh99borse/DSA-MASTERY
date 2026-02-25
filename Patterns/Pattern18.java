//HOLLOW HOURGLASS PATTERN
class Pattern18 {
    public static void main(String[] args) {
        int n = 7;   // Must be odd for perfect center

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i==0 || i == j || i + j == n - 1 || i==n-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}