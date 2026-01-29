
import java.util.*;

class ArmstronginRange {

    static void isArmstrong(int num) {
        int temp = num;
        int temp2 = num;
        int sum = 0;
        int count = 0;

        while (num != 0) {
            num = num / 10;
            count++;
        }
        while (temp != 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, count);
            temp = temp / 10;
        }
        if (sum == temp2) {
            System.out.println(temp2 + " is Armstrong");
        } else {
            System.out.println(temp2 + "is not Armstrong");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number upto:");
        int rangenum = sc.nextInt();

        for (int i = 0; i <= rangenum; i++) {
            isArmstrong(i);
        }
    }
}
