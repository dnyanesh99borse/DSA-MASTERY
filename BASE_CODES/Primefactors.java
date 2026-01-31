
import java.util.*;

class Primefactors {

    static int isPrimefactor(int num) {
        int output = 0;
        
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                boolean isprime = true;
                output = i;
                for (int j = 2; j <= output/2; j++) {
                    if (output > 1 && output % j == 0) {
                        isprime = false;
                    }
                }
                if(isprime){
                        System.out.print(output+" ");
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = sc.nextInt();

        isPrimefactor(num);
    }
}
