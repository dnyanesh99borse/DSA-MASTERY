
import java.util.*;
class PerfectNumber{
    static void isPerfectNumber(int num){
        int sum = 0;

        for(int i=1; i< num; i++){
            if(num % i == 0){
                sum += i;
                System.out.println(sum);
            }
        }
        
        if(sum == num){
            System.out.println(num + " is a Perfect Number");
        }else{
            System.out.println(num + " is not a perfect Number");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        isPerfectNumber(num);
    }
}