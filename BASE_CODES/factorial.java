import java.util.*;
class factorial{
    static int factorial(int num){

        int fact = 1;
        for(int i=1; i<=num; i++){
            fact *= i; 
        }
        return fact;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int output = factorial(num);
        System.out.println("factorial of "+num+ " is: "+output);
    }
}