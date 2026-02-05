import java.util.*;
class DectoBin{
    static void findBin(int num){
        int output = 0;

        int i = 0;
        while(num >= 1){
            int digit = num % 2; 
            output += digit * Math.pow(10,i);
            num = num / 2;
            i++;
        }
        System.out.println(output);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        findBin(num);
    }
}