
import java.util.*;
class HarshadNumber{
    static void isHarshad(int num){
        int temp = num;
        int sum = 0;

        while(num != 0){
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        if(temp % sum == 0){
            System.out.println(temp +" is a Harshad Number.");
        }else{
            System.out.println(temp +" is a Not Harshad Number.");

        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        isHarshad(num);
    }
}