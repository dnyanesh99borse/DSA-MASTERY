
import java.util.*;

class LCM {

    static int findLcm(int num1, int num2) {

        int max = Math.max(num1, num2);

        while (true) {
            if (max % num1 == 0 && max % num2 == 0) {
                return max; // first common multiple
            }
            max++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the num2: ");
        int num2 = sc.nextInt();

        int output = findLcm(num1, num2);
        System.out.println("The LCM is: " + output);
    }
}
