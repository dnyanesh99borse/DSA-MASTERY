import java.util.*;
class sumofDigitsofNum{
    static void sumofdigits(int num){
        int temp = num;
        int sum = 0;

        while(temp != 0){
            int digit = temp % 10; //get last elemtent or digit.
            sum += digit;
            temp = temp / 10; //removes last element
        }

        System.out.println("The sum of the digits of the number is: "+sum);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        sumofdigits(num);
    }
}