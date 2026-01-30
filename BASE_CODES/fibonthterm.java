//find the Nth term of the fibonacci series

import java.util.*;
class Fibonthterm{
    static void fibonthterm(int n){
        if(n == 1){
            System.out.println(n);
        }

        int a = 0;
        int b = 1;
        for(int i=2; i<=n; i++){
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println("The " + n + "th Fibonacci term is: " + a);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        fibonthterm(n);

    }
}