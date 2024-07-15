public class patternQ18 {
    public static void main(String[] args) {
        int n=7;
        for(int i=1;i<=n-3;i++){
            for(int k=1; k<=(n-i);k++)
            System.out.print("  ");
            for(int j1=1;j1<=i;j1++)
            System.out.print("* ");
            for(int j2=1;j2<=i-1;j2++)
            System.out.print("* ");
             System.out.println();
        }
        for(int i1=n-4;i1>=1;i1--){
            for(int k1=1; k1<=(n-i1);k1++)
            System.out.print("  ");
            for(int j1=1;j1<=i1;j1++)
            System.out.print("* ");
            for(int j2=1;j2<=i1-1;j2++)
            System.out.print("* ");
             System.out.println();
        }
    
}
}
