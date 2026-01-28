// import java.util.*;

// class ReverseofNumber {
//     static void Reverse(int num) {
//         int temp = num;
//         int rev = 0;
//         int count = 0;
//         // Count digits
//         while (num != 0) {
//             num = num / 10;
//             count++;
//         }
//         // Reverse using place value
//         while (count != 0) {
//             int digit = temp % 10;
//             rev += digit * (int) Math.pow(10, count - 1);
//             temp = temp / 10;
//             count--;
//         }
//         System.out.println("The reverse of the number is: " + rev);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         Reverse(num);
//     }
// }
import java.util.*;

class ReverseofNumber {

    static void Reverse(int num) {
        int rev = 0;

        while (num != 0) {
            int digit = num % 10; //first take the last digit 
            rev = rev * 10 + digit; //move that digit to the left side and add the new digit in it
            //here as the number will increase it will do our work of unit, then tens, then hundreads and so on.. and hence just * 10;
            num = num / 10; //remove one last digit from the number.
        }
        System.out.println("The reverse of the number is: " + rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Reverse(num);
    }
}
