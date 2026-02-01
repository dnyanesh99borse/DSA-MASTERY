
import java.util.*;
class Strongnumber{
    static void isStrongNumber(int num){
        int temp = num;
        int sum =  0;

        while(num != 0){
            int digit = num % 10;
            int fact = 1;
            for(int i=1; i<=digit; i++){
                fact *= i;
            }
            sum += fact;
            num = num / 10;
        }
        if(sum == temp){
            System.out.println(temp+" is a Strong Number.");
        }else{
            System.out.println(temp+" is not a Strong Number.");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        isStrongNumber(num);
    }
}