public class patternQ19 {
    public static void main(String[] args) {
        int n =7;
        for(int i=n-2; i>=1; i--){
            for( int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=i; k<n-2;k++)
            System.out.print("  ");
            for(int k1=1;k1<((n-1)-i);k1++)
            System.out.print("  ");
            for(int j1=1;j1<=i && j1<n;j1++)
            System.out.print("* ");
            System.out.println();
        }
        for(int i1=2; i1<=n-3; i1++){
            for( int j3=1;j3<=i1;j3++){
                System.out.print("* ");
            }
            for(int k2=n-4;k2>i1;k2--){
            System.out.print("  ");
            for(int k3=1;k3<=(n-3)-i1;k3++)
            System.out.print("  ");
            for(int j4=1;j4<=i1;j4++)
            System.out.print("* ");
            System.out.println();
            }
        }
   
    }
    
}
