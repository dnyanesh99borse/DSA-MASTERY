//NUMBER TRIANGULAR

class Pattern11{
    public static void main(String[] args){
        int n = 4;
        for(int i=0; i<n; i++){
            for(int j=n-1; j>i; j--){
                // System.out.print("- ");
                System.out.print(" ");
            }
            for(int j=0; j<i+1; j++){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
         
    }
}

//    1 
//   2 2
//  3 3 3
// 4 4 4 4