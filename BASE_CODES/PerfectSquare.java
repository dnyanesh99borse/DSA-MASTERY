//PERFECT SQUARE: IS A NUMBER OBTAINED BY MULTIPLYING THE INTEGER BY ITSELF
// A PERFECT SQUARE IS A NUMBER WHOSE SQUARE ROOT IS AN INTEGER.

//---------------APPROACH ONE------------------------------
// import java.util.*;
// class PerfectSquare {
//     static void isPerfectSquare(int num) {
//         int i = 1;
//         while (i * i <= num) {
//             if (i * i == num) {
//                 System.out.println(num + " is a Perfect Square.");
//                 return;
//             }
//             i++;
//         }
//         System.out.println(num + " is NOT a Perfect Square.");
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         isPerfectSquare(num);
//     }
// }
//------------ANOTHER APPROACH WITH MATH.SQRT();----------------
import java.util.*;

class PerfectSquare {

    static void isPerfectSquare(int num) {
        int root = (int) Math.sqrt(num);

        if (root * root == num) {
            System.out.println(num + " is a Perfect Square.");
        } else {
            System.out.println(num + " is NOT a Perfect Square.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        isPerfectSquare(num);
    }
}
