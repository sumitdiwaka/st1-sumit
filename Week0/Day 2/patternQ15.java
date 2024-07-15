public class patternQ15 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=n; i>=1;i--){
            for( int k=1; k<=(n-i); k++)
            System.out.print("    ");
            for(int j=1; j<=i;j++)
            System.out.print("* ");
            System.out.println();
        }
        for(int i1=2; i1<=n; i1++){
            for(int k1=1;k1<=(n-i1);k1++)
            System.out.print("    ");
            for(int j1=1;j1<=i1;j1++)
            System.out.print("* ");
            System.out.println();
        }
        
}
}