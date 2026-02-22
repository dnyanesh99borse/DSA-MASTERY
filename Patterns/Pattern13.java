class Pattern13{
    public static void main(String[] args){
        int n = 4;
        
        for(int i=0; i<n; i++){
            int k = i;
            for(int j=0; j<i; j++){
                // System.out.print("-");
                System.out.print(" ");
            }
            for(int j=n; j>i; j--){
                k++;
                System.out.print(k+ " ");
            }
            System.out.println();
        }
    }
}

// 1 2 3 4 
//  2 3 4 
//   3 4 
//    4 