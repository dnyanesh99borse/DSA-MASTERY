import java.util.*;
class OctaltoDecimal{
    static int octaltoDecimal(int octal){
        int sum = 0;
        int power = 0;

        while(octal != 0){
            int bit = octal % 10;
               // Validate octal digit
            if (digit < 0 || digit > 7) {
                return -1; // invalid octal number
            }
            sum += bit * Math.pow(8,power);
            octal = octal / 10;
            power++;
        }
        return sum;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the binary number: ");
        int octal = sc.nextInt();

        int output = octaltoDecimal(octal);
        System.out.println("The Decimal value of " + octal + " is: " + output);
    }
}