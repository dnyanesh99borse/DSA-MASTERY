//ZERO-ONE TRIANGLE

class Pattern8{
    public static void main(String[] args){
        int n = 4; 
        boolean isone = true;
        for(int i=0; i<n; i++){
            if(i%2 == 0) isone = false;
            for(int j=0; j<=i; j++){
                if(!isone){
                    System.out.print(1+" ");
                    isone = true;
                }else{
                    System.out.print(0+" ");
                    isone = false;
                }
                
            }
            System.out.println();
        }
    }
}