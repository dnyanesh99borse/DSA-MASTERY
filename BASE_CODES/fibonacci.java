import java.util.*;
class Fibonacci{
    static void fibonacciSeries(int n){
        if(n == 0 || n == 1){
            System.out.println(n);
        }

        int a = 0;
        int b = 1;
        for(int i=1; i<n; i++){
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c +" ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        fibonacciSeries(n);

    }
}