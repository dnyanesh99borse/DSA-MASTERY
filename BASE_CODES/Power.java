
import java.util.*;

class Power {

    static int numpower(int num, int pow) {

        int output = 1;
        while (pow != 0) {
            output *= num;
            pow--;
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter a power: ");
        int pow = sc.nextInt();

        int mainoutput = numpower(num, pow);
        System.out.println(num + " raise to " + pow + " is: " + mainoutput);
    }
}

//-------USING DEFAULT FUNCTION---------------------
//Math.pow(num,pow);
// class Power{
//     public static void main(String[] args){
//         int num = 4;
//         int pow = 7;
//         int output = (int)Math.pow(num,pow);
//         System.out.println(output);
//     }
// }
