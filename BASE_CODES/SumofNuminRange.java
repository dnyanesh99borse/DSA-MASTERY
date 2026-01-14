//Sum of numbers in a given range:

class SumofNuminRange{
    public static void main(String[] args){
        int start = 2;
        int end = 10;
        int sum = 0;

        for(int i = start; i <= end; i++){
            sum += i;
        }
        System.out.println("the sum of the numbers in the range is: " + sum);
    }
}