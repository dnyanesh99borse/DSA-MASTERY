import java.util.*;
class PositiveNegative{
    static void checkPositiveNegative(int num){
        if(num < 0){
            System.out.println("negative number");
        }else if(num > 0){
            System.out.println("Positive");
        }else{
            System.out.println("zero");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check: ");
        int num = sc.nextInt();

        checkPositiveNegative(num);
    }
}