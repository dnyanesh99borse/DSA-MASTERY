import java.util.*;
class PrimewithRange{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    boolean isPrime = true; 

    if(num < 1){
        isPrime = false;
    }else{
        for(int i=2; i<num/2; i++){  //num/2 means, the only the number which is half of the number could be divide the numbe else all are the larger.
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
    }
    if(isPrime){
        System.out.println(num+" is a Prime number");
    }else{
        System.out.println(num+" is not a Prime number");
    }
   }
}


