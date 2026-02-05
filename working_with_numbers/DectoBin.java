import java.util.*;

class DectoBin {
    static void findBin(int num) {
        String binary = "";

        while (num > 0) {
            int digit = num % 2;
            binary = digit + binary;
            num = num / 2;
        }

        System.out.println(binary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        findBin(num);
    }
}
