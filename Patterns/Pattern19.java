
//-------------------PASCAL'S TRIANGLE--------------------------------
class Pattern19{
    public static void main(String[] args){
        int n = 4;
        for(int i=0; i<n; i++){
            for(int j=n; j>i; j--){
                System.out.print("-");
            }
            for(int j=0; j<=i; j++){
                System.out.print(1+" ");
            }
            System.out.println();
        }
    }
}