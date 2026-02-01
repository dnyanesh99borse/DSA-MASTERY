//THE ABUNDANT NUMBER IS A POSITIVE INTEGER WHOSE SUM OF PROPER FACTORS(EXCLUDING ITSELF) GREATER THAN THE NUMBER.
//REMEMBER THE CASE (EXCLUDING ITSELEF); i.e: i < num and not i <= num;

import java.util.*;

class AbundantNumber {

    static void isAbundant(int num) {
        int sum = 1;  //cause one is always divisor hence keep it bforehand (aahich).

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        if (sum > num) {
            System.out.println(num + " is an Abundant number");
        } else {
            System.out.println(num + " is NOT an Abundant number");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        isAbundant(num);
    }
}
