//k pattern (right half pyramid + reverse right half pyramid)

class Pattern4 {

    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int k = 1; k <= n; k++) {
            for (int l = 0; l < k; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
