//--------------THIS IS FIRST AND BASIC APPROACH---------------------------------

// import java.util.*;
// class HCF{
//     static int findhcf(int num1,int num2){
//         int min = Math.min(num1,num2);
//         int hcf = 1;
//         for(int i=1; i<=min; i++){
//             if(num1 % i == 0 && num2 % i == 0){
//                 hcf = i;
//             }
//         }
//         return hcf;
//     }
    
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the num1: ");
//         int num1 = sc.nextInt();
//         System.out.print("Enter the num2: ");
//         int num2 = sc.nextInt();

//         int output = findhcf(num1,num2);
//         System.out.println("The HCF is: "+output);
//     }
// }

//-------------THE OPTIMAL APPROACH USING EUCLEDIAN DISTANCE-------------------------
