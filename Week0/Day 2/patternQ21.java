public class patternQ21 {
    public static void main(String[] args) {
        int n =5;
        for(int i=1; i<=n; i++){
            for( int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=1; k<=(n-i);k++)
            System.out.print("  ");
            for(int k1=1;k1<=(n-i);k1++)
            System.out.print("  ");
            for(int j1=1;j1<=i;j1++)
            System.out.print("* ");
            System.out.println();
        }
            
        }
    }

 