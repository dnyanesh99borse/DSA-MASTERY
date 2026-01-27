
import java.util.*;
class BasicsbutImp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------- String Input ----------
        System.out.println("Enter a String:");
        String s = sc.nextLine();

        // ---------- Single Character Input ----------
        // Taking input as String, then extracting first character
        System.out.println("Enter a Character:");
        char c = sc.next().charAt(0);

        // ---------- Character Array Input ----------
        System.out.println("Enter 5 characters (one by one):");
        char[] d = new char[5];

        for (int i = 0; i < d.length; i++) {
            d[i] = sc.next().charAt(0);  // take first character only
        }

        // Printing character array
        System.out.print("Character Array: ");
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println();

        // ---------- Integer Array Input ----------
        System.out.println("Enter 5 integers:");
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Printing integer array
        System.out.print("Integer Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // ---------- Length Outputs ----------
        System.out.println("Length of String: " + s.length());
        System.out.println("Length of Integer Array: " + arr.length);
        System.out.println("Character entered: " + c);

        sc.close(); // good practice
    }
}
