//RHOMBUS PATTERN
class Pattern9{
    public static void main(String[] args){
        int n = 4;
        for(int i=0; i<n+1; i++){
            for(int k = 0; k<i; k++){
                // System.out.print("-");
                System.out.print(" ");
            }
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


// * * * * 
//  * * * *
//   * * * *
//    * * * *
//     * * * *