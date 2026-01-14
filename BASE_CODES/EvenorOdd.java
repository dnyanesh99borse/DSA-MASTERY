// import java.util.*;

// class EvenorOdd{
//     static void findEvenOdd(int num){
//         if(num % 2 == 0){
//             System.out.println("Even");
//         }else{
//             System.out.println("Odd");
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int num = sc.nextInt();

//         findEvenOdd(num);
//     }
// }


//-----USING TERNERY OPERATORS  
class EvenorOdd{
    public static void main(String[] args){
        int num = 4;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }
}