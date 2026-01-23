//first we should know the condition to apply on the year to verify, whether it is LEAF or NOT
//If the year is divisible by 400, it is a leap year. 
//If the year is divisible by 100 but not by 400, it is not a leap year. 
//If the year is divisible by 4 but not by 100, it is a leap year. 
//In all other cases, it is not a leap year.

import java.util.*;

class LeapYear {

    static void checkLeaporNot(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + "is a Leap Year");
                } else {
                    System.out.println(year + " is not a Leap Year");
                }
            } else {
                System.out.println(year + " is a Leap Year");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Year to check: ");
        int year = sc.nextInt();

        checkLeaporNot(year);
    }
}
