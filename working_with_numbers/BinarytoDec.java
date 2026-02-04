
import java.util.*;

class BinarytoDec {

    static int binaryToDecimal(int bin) {
        int sum = 0;
        int power = 0;

        while (bin != 0) {
            int bit = bin % 10;
            sum += bit * Math.pow(2, power);
            bin = bin / 10;
            power++;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the binary number: ");
        int bin = sc.nextInt();

        int output = binaryToDecimal(bin);
        System.out.println("The Decimal value of " + bin + " is: " + output);
    }
}
