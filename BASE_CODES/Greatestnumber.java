// //Greatest of two numbers: 
// import java.util.*;
// class Greatestnumber{
//     static void GreatestofTwonum(int num1, int num2){
//         if(num1 > num2){
//             System.out.println(num1+ " is greatest");
//         }else{
//             System.out.println(num2+ " is greatest");
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the first number: ");
//         int num1 = sc.nextInt();
//         System.out.println("Enter the second number: ");
//         int num2 = sc.nextInt();
//         GreatestofTwonum(num1,num2);
//     }
// }




//Greatest of three numbers: 
import java.util.*;

class Greatestnumber {

    static void GreatestofThreenum(int num1,int num2,int num3) {
        if (num1 > num2) {
            if(num2 > num3){
                System.out.println(num1 + " is greatest");
            }else{
                 System.out.println(num2 + " is greatest");
            }
        } else {
            System.out.println(num3 + " is greatest");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the Third number: ");
        int num3 = sc.nextInt();
        GreatestofThreenum(num1, num2, num3);
    }
}
