//-------------------LOGIC----------------------------------

// 1.Take the hexadecimal number as a string because it can contain letters.
// 2.Initialize a variable to store the final decimal result and set it to zero.
// 3.Initialize another variable to keep track of the power of 16, starting from zero.
// 4.Start reading the hexadecimal number from the rightmost character and move towards the left.
// 5.For each character, determine its decimal value:
// 6.If the character is between 0 and 9, its decimal value is the same number.
// 7.If the character is between A and F (or a and f), its decimal value is from 10 to 15.
// 8.If the character is anything else, the input is not a valid hexadecimal number.
// 9.Multiply the decimal value of the current character by 16 raised to the current power.
// 10.Add this value to the final result.
// 11.Increase the power of 16 by one.
// 12.Repeat the process until all characters of the hexadecimal number are processed.
// 13.The final accumulated result is the decimal equivalent of the hexadecimal number.




//----------------------first and long approach-------------------
// import java.util.*;

// class HextoDecimal {
//     static int hexToDecimal(String hexa) {
//         int sum = 0;
//         int power = 0;

//         for (int i = hexa.length() - 1; i >= 0; i--) {
//             char ch = hexa.charAt(i);
//             int digit;

//             if (ch >= '0' && ch <= '9')
//                 digit = ch - '0';
//             else if (ch >= 'A' && ch <= 'F')
//                 digit = ch - 'A' + 10;
//             else if (ch >= 'a' && ch <= 'f')
//                 digit = ch - 'a' + 10;
//             else
//                 return -1;

//             sum += digit * Math.pow(16, power);
//             power++;
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter hexadecimal number: ");
//         String hexa = sc.next();

//         int result = hexToDecimal(hexa);

//         if (result == -1)
//             System.out.println("Invalid hexadecimal number");
//         else
//             System.out.println("Decimal value: " + result);
//     }
// }


//------------------USING FUNCTION AND OPTIMAL APPROACH-------------------


class HextoDecimal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter hexadecimal number: ");
        String hex = sc.nextInt();

        int decimal = Integer.parseInt(hex,16); //parseInt with no and 16 and same for other numbers too.

        System.out.println("Decimal value: "+decimal);
    }
}