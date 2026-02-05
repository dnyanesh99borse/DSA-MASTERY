import java.util.*;
class DectoOct{
    static void findOctal(int num){
        String binary = "";
        while(num > 0){
            int digit = num % 8; //it will give the remainder
            binary = digit + binary; //add remainder one before other.
            num = num / 8; //will give the quotient
        }
        System.out.println(binary);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Decimal number: ");
        int dec = sc.nextInt();

        findOctal(dec);
    }
}