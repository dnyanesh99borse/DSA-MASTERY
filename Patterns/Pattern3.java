//REVERSE RIGHT HALF PYRAMID
class Pattern3{
    public static void main(String[] args){
        int n = 5;
        for(int i=0 ;i<5; i++){
            for(int j=1; j<=n - i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// * * * * * 
// * * * *
// * * * 
// * *
// * 