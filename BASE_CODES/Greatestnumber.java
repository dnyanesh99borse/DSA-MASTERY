//Greatest of two numbers: 
import java.util.*;
class Greatestnumber{
    static void GreatestofTwonum(int num1, int num2){
        if(num1 > num2){
            System.out.println(num1+ " is greatest");
        }else{
            System.out.println(num2+ " is greatest");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        GreatestofTwonum(num1,num2);
    }
}