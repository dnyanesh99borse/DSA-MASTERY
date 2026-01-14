//sum of N natural numbers

// import java.util.*;
// class SumofNaturalNum{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int sum = 0;

//         System.out.print("Enter the number upto take: ");
//         int num = sc.nextInt();

//         for(int i = 1; i<num; i++){
//             sum += i;
//         }

//         System.out.println("the sum of natural num from 1 to "+num+" is: " + sum);
//     }
// }


//------------------using Recursion-----------------------------

import java.util.*;

class SumofNaturalNum{

    //Recursive function
    static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n + sum(n-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number upto take: ");
        int num = sc.nextInt();

        int result = sum(num);

        System.out.println("The sum of natural numbers from 1 to " + num + " is: " + result);
    }
}