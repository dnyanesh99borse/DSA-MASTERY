// ✅ Correct Logic (Simple Explanation)
// Count digits
// Find highest power of 10
// For each digit:
// digit × place value
// reduce place value

import java.util.*;

class Expandedform {

    static void expandedForm(int num) {
        int temp = num;
        int count = 0;

        // Count digits
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int divisor = (int) Math.pow(10, count - 1); //that the same logic written in your notebook.
        while (divisor != 0) {
            int digit = num / divisor;
            System.out.print(digit * divisor + " ");
            num = num % divisor;
            divisor /= 10;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        expandedForm(num);
    }
}
