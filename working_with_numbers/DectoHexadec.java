import java.util.*;
class DectoHexadec{
    static void findHexa(int num){
        String hex = "";

        while(num > 0){
            int digit = num % 16;
            if (digit < 10){
                hex = digit + hex; //to print it inverted.
            }else {
                hex = (char)(digit - 10 + 'A') + hex; //10 - 15 ---> A-F
            }
            num = num / 16;
        } 
        System.out.println("the hexadecimal is: "+hex);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the decimal number: ");
        int num = sc.nextInt();

        findHexa(num);
    }
}