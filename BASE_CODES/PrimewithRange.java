
import java.util.*;
class Prime {

    static boolean checkPrime(int num) {
        boolean isPrime = true;
        if(num < 1){
            isPrime = false;
        }
        for (int i = 2; i < num; i++) {        //MAIN LOGIC OF THE CODE.
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean output = checkPrime(num);
        if (output == true) {
            System.out.println("the number is Prime number");
        } else {
            System.out.println("the number is not Prime number");
        }
    }
}
