import java.util.*;
class Palindrome{
    static void Palindrome(int num){
        int rev = 0;
        int temp = num;

        while(num != 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        if(temp == rev){
            System.out.println(temp + " is Palindrome.");
        }else{
            System.out.println(temp + " is Not Palindrome.");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Palindrome(num);
    }
}

//first Reverse and then check both the number if same then : Palindrome else not Palindrome