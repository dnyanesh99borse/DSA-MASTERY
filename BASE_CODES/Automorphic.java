
//AUTOMORPHIC: AN AUTOMORPHIC NUMBER IS A NUMBER WHOSE SQUARE HAS THE SAME LAST DIGITS AS THE NUMBER ITSELF.
import java.util.*;
class Automorphic{
    static void isAutomorphic(int num){
        int square = num * num;
        int temp = num;
        boolean isAutomorphic = true;

        int length = String.valueOf(num).length();

        while(length != 0){
            int digit1 = num % 10;
            int digit2 = square % 10;

            if(digit1 != digit2){
                isAutomorphic = false;
            }

            num = num / 10;
            square = square / 10;
            length--;
        }

        if(isAutomorphic){
            System.out.println(temp + " is Automorphic");
        }else{
            System.out.println(temp + " is Not Automorphic");

        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        isAutomorphic(num);
    }
}

//-------------------SLIGHTLY BETTER AND CLEANER APPROACH------------------------
// static void isAutomorphic(int num) {
//     int square = num * num;
//     int temp = num;

//     while (num != 0) {
//         if (num % 10 != square % 10) {
//             System.out.println(temp + " is Not Automorphic");
//             return;
//         }
//         num /= 10;
//         square /= 10;
//     }

//     System.out.println(temp + " is Automorphic");
// }
