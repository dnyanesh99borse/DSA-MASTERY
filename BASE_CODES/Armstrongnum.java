
import java.util.*;

class Armstrongnum {

    static void Armstrong(int num) {
        int temp = num;
        int temp2 = num;
        int sum = 0;
        int count = 0;

        while (num != 0) {
            num = num / 10;
            count++;
        }
        while (temp != 0) {
            int digit = temp % 10; //to get the last number.
            sum += Math.pow(digit, count);
            temp = temp / 10;  //to remove the last digit 
        }

        if (sum == temp2) {
            System.out.println("is Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Armstrong(num);
    }
}

//----------------another optimal approach----------------------
// import java.util.*;
// class Armstrongnum {
//     static boolean isArmstrong(int num) {
//         int original = num;
//         int sum = 0;
//         int digits = String.valueOf(num).length(); // digit count
//         while (num != 0) {
//             int digit = num % 10;
//             int power = 1;
//             // calculate digit^digits manually
//             for (int i = 0; i < digits; i++) {
//                 power *= digit;
//             }
//             sum += power;
//             num /= 10;
//         }
//         return sum == original;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         if (isArmstrong(num))
//             System.out.println("Armstrong Number");
//         else
//             System.out.println("Not an Armstrong Number");
//     }
// }

