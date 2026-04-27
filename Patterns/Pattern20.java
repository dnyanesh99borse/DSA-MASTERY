
public class Pattern20 {

    public static void butterFly(int n) {

        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            for (int j = 0; j <= (n / 2) - i - 1; j++) {
                // System.out.print(" o ");
                System.out.print("  ");
            }
            for (int j = 0; j <= (n / 2) - i - 1; j++) {
                // System.out.print(" o ");
                System.out.print("    ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n / 2; i++) {
            for (int j = 0; j <= (n / 2) - i; j++) {
                // System.out.print(" o ");
                System.out.print(" * ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j < i; j++) {
                System.out.print("    ");
            }
            for (int j = 0; j <= (n / 2) - i; j++) {
                // System.out.print(" o ");
                System.out.print(" * ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterFly(8);
    }
}
